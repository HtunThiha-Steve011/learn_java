package mini_projects.demo_bank_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private UUID id = UUID.randomUUID();
    private String name;
    private List<Account> accountsList = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
