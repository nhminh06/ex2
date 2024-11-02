public class Account {
    private int id;
    private customer1 customer;
    private double balance = 0.0;
    public Account(int id, customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, customer1 customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }

    public customer1 getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
