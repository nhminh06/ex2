public class TestMain1 {
    public static void main(String[] args) {
        customer1 customer = new customer1(1, "John Doe", 'm');
        System.out.println("Customer Details: " + customer);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Gender: " + customer.getGender());
        Account account = new Account(101, customer, 500.0);
        System.out.println("Account Details: " + account);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Customer: " + account.getCustomer());
        System.out.println("Account Balance: $" + account.getBalance());
        System.out.println("Account Customer Name: " + account.getCustomerName());
        account.deposit(150.0);
        System.out.println("After Deposit: " + account);
        account.withdraw(200.0);
        System.out.println("After Withdraw: " + account);
        account.withdraw(1000.0);
        System.out.println("After Insufficient Withdraw: " + account);
    }
}
