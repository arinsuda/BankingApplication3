
package bankingapplication3;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public Account getAccount(int number) {
        String accountname = "aaa";
        double balance  = 500;
        Account account = new Account(number, accountname, balance);
        return account;
    }
    
    public void listAccounts(){
    
    }
    
    
    public void openAccount(Account account){

    }
    
    public void closeAccount(int number){
    
    }
    
    public void depositMoney(Account account,double amount){
        account.Deposit(amount);
    }
    
     public void withdrawMoney(Account account,double amount){
        account.Withdraw(amount);
    }
}
