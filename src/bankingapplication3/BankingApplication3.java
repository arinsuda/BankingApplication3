
package bankingapplication3;

import java.util.Scanner;

public class BankingApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("xyz");
        int option = 0 , number;
        String name;
        double balance , amount;
        Account account;
        
        while (option!=6){
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New Accounts");
            System.out.println("3. Close existing Accounts");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println("  ");
            
            System.out.print("Enter your choice : ");
            option = scan.nextInt();
            scan.nextLine();
            System.out.println();
        
            switch(option){
                case 1:
                    bank.listAccounts();
                case 2:
                    number = 111111;
                    System.out.print("Enter Account Name : ");
                    name = scan.nextLine();
                    System.out.print("Enter Initial Balance : ");
                    balance = scan.nextDouble();
                    account = new Account(number,name,balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.print("Enter Account Number : ");
                    number = scan.nextInt();
                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.print("Enter Account Number :");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.depositMoney(account, amount);
                    break;
                case 5:
                    System.out.print("Enter Account Number :");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount :");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(account, amount);
                    break;
                    
            }
        }
        
    }
    
}
