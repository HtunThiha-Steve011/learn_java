package mini_projects.demo_bank_system;

import javax.swing.*;
import java.util.UUID;

public class Account {
    private UUID id = UUID.randomUUID();
    private User owner;
    private Bank bank;
    private String password;
    private double amount;

    public Account(User owner, Bank bank, String password, double initialAmount) {
        this.owner = owner;
        this.bank = bank;
        this.password = password;
        this.amount = initialAmount;
    }

    public void displayAccountInfo() {
        String displayMsg = "Account ID: " + this.id
                + "\nUser: " + this.owner.getName()
                + "\nBank: " + this.bank.getName()
                + "\nAmount: " + this.amount + "\n";
        JOptionPane.showMessageDialog(null, displayMsg, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void deposit(double amount, String password) {
        if (password.equals(this.password)) {
            this.amount += amount;
        }
    }

    public void withdraw(double amount, String password) {
        if(password.equals(this.password)) {
            this.amount -= amount;
        }
    }
}
