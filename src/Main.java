import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance for Account 1: ");
        double balance1 = scanner.nextDouble();
        BankAccount account1 = new BankAccount(balance1);

        System.out.print("Enter initial balance for Account 2: ");
        double balance2 = scanner.nextDouble();
        BankAccount account2 = new BankAccount(balance2);

        while (true) {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.print("Deposit to Account 1 or 2? (1/2): ");
                    int depositAccount = scanner.nextInt();
                    if (depositAccount == 1) {
                        account1.deposit(depositAmount);
                    } else if (depositAccount == 2) {
                        account2.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account selection.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.print("Withdraw from Account 1 or 2? (1/2): ");
                    int withdrawAccount = scanner.nextInt();
                    if (withdrawAccount == 1) {
                        account1.withdraw(withdrawAmount);
                    } else if (withdrawAccount == 2) {
                        account2.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account selection.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Transfer from Account 1 to Account 2? (yes/no): ");
                    String transferDirection = scanner.next();
                    if (transferDirection.equalsIgnoreCase("yes")) {
                        account1.transfer(transferAmount, account2);
                    } else if (transferDirection.equalsIgnoreCase("no")) {
                        account2.transfer(transferAmount, account1);
                    } else {
                        System.out.println("Invalid transfer direction.");
                    }
                    break;

                case 4:
                    System.out.println("Account 1 Balance: " + account1.getBalance());
                    System.out.println("Account 2 Balance: " + account2.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
