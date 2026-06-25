import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(10023, "Hitesh Singh", 50000.00);

        System.out.println("========================================");
        System.out.println("            Banking Application         ");
        System.out.println("========================================");

        for(boolean running = true; running; System.out.println()) {
            printMenu();

            double amount;
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting .... .... Goodbye !!");
                    running = false;
                    break;
                case 1:
                    System.out.println("Enter deposit amount :");
                    amount = sc.nextDouble();
                    bankAccount.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount :");
                    amount = sc.nextDouble();
                    bankAccount.withdraw(amount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                default:
                    System.out.println("invalid choice. Please try again.");
            }
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("----------------------------------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------");
    }
 }

