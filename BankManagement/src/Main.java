import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
         for (int i = 0; i < 4; i++) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
             int option = scanner.nextInt();
             if (option == 1) {
                System.out.print("Enter Account ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Initial Balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double annualInterestRate = scanner.nextDouble();
                System.out.print("Enter Overdraft Limit: ");
                double overdraftLimit = scanner.nextDouble();
                 accounts.add(new ChekingAccount(id, balance, annualInterestRate, overdraftLimit));
            } else if (option == 2) {
                System.out.print("Enter Account ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Initial Balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double annualInterestRate = scanner.nextDouble();
                System.out.print("Enter Credit Card Number: ");
                String creditCardNumber = scanner.next();
                System.out.print("Enter Credit Card Expiry Date (MM/YYYY): ");
                String creditCardExpiryDate = scanner.next();
                 accounts.add(new SavingsAccount(1222, 10000, 4.5, "123435", Calendar.getInstance()));
            }
        }
         for (Account account : accounts) {
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Account ID: " + account.getId());
            System.out.println("Date Created: " + account.getDateCreated().getTime());
            System.out.println("Current Balance: $" + account.getBalance());
            System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
            System.out.println("Monthly Interest Amount: $" + account.getMonthlyInterestAmount());
             if (account instanceof ChekingAccount) {
                ChekingAccount chekingAccount = (ChekingAccount) account;
                System.out.println("Overdraft Limit: $" + chekingAccount.getOverdraftLimit());
            } else if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println("Credit Card Number: " + savingsAccount.getCreditCardNumber());
                System.out.println("Card Expiry Date: " + savingsAccount.getCreditCardExpiryDate().getTime());
                System.out.println("Credit Balance: $" + savingsAccount.getCreditBalance());
            }
             System.out.println("-----------------------------------------------");
        }
    }
}