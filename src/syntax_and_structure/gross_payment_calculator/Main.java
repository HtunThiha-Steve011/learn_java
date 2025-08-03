package syntax_and_structure.gross_payment_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initiateGrossPaymentCalculator();
    }

    // example of inputs, outputs and error handling
    public static void initiateGrossPaymentCalculator() {
        System.out.println("===== Gross Payment Calculator =====");

        Scanner scanner = new Scanner(System.in);
        boolean errorInInputs;
        do {
            try {
                System.out.print("Enter number of hours worked: $");
                double hours = scanner.nextDouble();
                System.out.print("Enter payment rate: $");
                double rate = scanner.nextDouble();
                scanner.close();

                System.out.println("Your total payment is: $" + (hours * rate));
                errorInInputs = false;
            } catch (InputMismatchException e) {
                System.out.println("Only numbers and decimals are allowed. Please try again.\n");
                scanner.nextLine();
                errorInInputs = true;
            }
        } while (errorInInputs);
    }
}
