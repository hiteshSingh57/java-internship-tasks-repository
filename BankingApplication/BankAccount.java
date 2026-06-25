public class BankAccount {
    final private int accountNumber;
    private String accountHolderName;
    private double balance;

    public  BankAccount(int accountNumber, String accountHolderName, double balance ) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return  accountHolderName;}
    public double getBalance() { return  balance;}

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount){
        if (amount<=0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount<=0 ) {
            System.out.println("Invalid amount");
            return;
        }
        if ( amount>balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance-= amount;
    }
    public  void checkBalance() {
        System.out.println(" Balance : " +this.balance);

    }
}
