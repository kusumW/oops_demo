import java.util.Scanner;

public class bank {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        String accountName;
        double startBalance;

      //  System.out.printf("%s\n","BankApp v1.0");
        System.out.println("=====================================");
        System.out.println("Please enter your details below.");
        System.out.println("Account Name: ");
        accountName = scanner.nextLine();
        System.out.println("Starting Balance: ");
        startBalance = scanner.nextDouble();
        Account account = new Account(accountName,startBalance);
        while(!quit){
            printMainMenu();
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Account Name: %s\nAccount Balance: $%.2f\n",account.getAccountName(),
                            account.getAccountBal());
                    break;
                case 2:
                    System.out.println("Enter amount to be added: ");
                    account.addFunds(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter amount to be transferred: ");
                    account.transferFunds(scanner.nextDouble());
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }

    public static void printMainMenu(){
        System.out.printf("%s\n" +
                "=====================================\n" +
                "Please select an option:\n" +
                "1 - Check Balance\n" +
                "2 - Add Funds\n" +
                "3 - Transfer Funds\n" +
                "4 - Exit the program\n" +
                "=====================================\n" +
                "Choice: ","Bank app");
    }
}

 class Account {
    private String accountName;
    private double accountBal;

    public Account(String accountName, double accountBal) {
        if(accountBal < 0) {
            System.out.println("Starting balance cannot be less than zero.\nBalance set to $0.00");
        }else {
            this.accountName = accountName;
            this.accountBal = accountBal;
            System.out.println("Account initialized.\nBalance set to $" + this.accountBal);
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public void transferFunds(double withdrawal){
        if(withdrawal > this.accountBal){
            System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",withdrawal);
        }else if(withdrawal < 0){
            System.out.println("Transfer amount must be greater than zero. Transfer failed.");
        }else{
            this.accountBal -= withdrawal;
            System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",withdrawal,this.accountBal);
        }
    }

    public void addFunds(double deposit){
        if(deposit < 0){
            System.out.println("Amount deposited must be greater than zero.");
        }else {
            this.accountBal += deposit;
            System.out.printf("Deposit of $%.2f successful. Your new balance is $%.2f.\n",deposit,this.accountBal);
        }
    }
}
