public class Account {
    // Private fields for account data
    private double balance;
    private String accountNumber;
    private String email;
    private String customerName;
    
    // Static counter for generating unique account numbers
    private static int accountCounter = 0;
    
    // Constructor that accepts customer name
    public Account(String customerName) {
        // Validate customer name (task 3.3)
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        
        this.customerName = customerName;
        this.balance = 1000.0; // Set initial balance to 1000.0
        this.accountNumber = generateAccountNumber(); // Generate unique account number
    }
    
    // Static method for generating sequential account numbers
    private static synchronized String generateAccountNumber() {
        accountCounter++;
        return String.valueOf(accountCounter);
    }
    
    // Getter methods for all properties with proper encapsulation
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    // Setter methods with validation for balance and email
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }
    
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @ symbol");
        }
        this.email = email;
    }
}