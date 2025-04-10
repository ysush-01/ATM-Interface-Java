import java.util.Scanner;

public class ATM {
    private double balance;
    //Constructor to initialize balance
    public ATM(double initialbalance)
    {
        this.balance=initialbalance;
    }
    public void checkBalance()
    {
        System.out.println("Current Balance:"+balance);
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println(amount + " deposited successfully");
        }
        else
            System.out.println("Invalid deposit amount");
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println(amount + " withdrawl successfully");
        }
        else
            System.out.println("Insufficient balance or invalid amount");
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000);
        int choice;
        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money ");
            System.out.println("4. Exit\n");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdrawl: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Tnank you for using the ATM. GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        } while (choice != 4);
        scanner.close();
    }
}
