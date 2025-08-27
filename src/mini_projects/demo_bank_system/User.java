package mini_projects.demo_bank_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id = UUID.randomUUID();
    private String name;
    private String email;
    private UserRole userRole;
    private String password;
    private List<Account> ownedAccounts = new ArrayList<>();

    public User(String name, String email, UserRole userRole, String password) {
        this.name = name;
        this.email = email;
        this.userRole = userRole;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return this.userRole;
    }
}
