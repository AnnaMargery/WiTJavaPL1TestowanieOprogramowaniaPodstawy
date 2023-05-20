package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void transferMoney(Account account, float amount) {
        //if(this.getAccountNumber().length() == 26 && account.getAccountNumber().length() == 26) {
        if(validateAccountNumber(this) && validateAccountNumber(account)) {
            transfer(account, amount);
        } else {
            System.out.println("Wrong account number!");
        }
    }

    private void transfer(Account account, float amount) {
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
    }

    private boolean validateAccountNumber(Account account) {
        return account.getAccountNumber().length() == 26;
    }
}