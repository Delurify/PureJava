public class Customer {
    private String name;
    private Account account; // Added Account field for one-to-one relationship

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        // Create Account instance with customer name
        this.account = new Account(name);
        // Set email and balance from parameters if provided
        if (email != null && !email.equals("unknown")) {
            this.account.setEmail(email);
        }
        // Note: creditLimit is now represented as balance in Account (set to 1000.0 by default)
        // We could add a setter for balance if needed to honor the creditLimit parameter
    }
    
    public Customer(String name, String email) {
        this(name, 0.0, email);
    }

    public Customer() {
        this("unknown", "unknown");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        // Delegate to Account's balance
        return this.account != null ? this.account.getBalance() : 0.0;
    }

    public String getEmail() {
        // Delegate to Account's email
        return this.account != null ? this.account.getEmail() : "";
    }
}