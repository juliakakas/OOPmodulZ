package Bank;

public class BankAccount {
    String accountName;
    int balance;
    String accountNumber;

    public BankAccount(String accountName, int balance, String accountNumber){
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
    public int depositBalance(int deposit){
        balance += deposit;
        return balance;
    }

    public int withdrawBalance(int withdraw) {
       if (balance < withdraw){
           throw new RuntimeException("no money");
        }
        balance -= withdraw;
        return balance;
    }

    public int transferBalance(int transfer, BankAccount bankAccount){
        if (balance < transfer){
            throw new RuntimeException("not enough money");
        }
        balance -= transfer;
        return balance;

        //bankAccount.setBalance(bankAccount.getBalance()+ transfer);
        // meg kéne érkeznie az összegnek
    }

    public void isValidAccountNumber(String accountNumber){
        int sum = 0;
        for (int i = 0; i <accountNumber.length() ; i++) {
            sum += Integer.parseInt(String.valueOf(accountNumber.charAt(i)));
            //System.out.println(sum);
        }
        if (sum < 20){
            System.out.println("not valid account number");
        } else {
            if (Integer.parseInt(String.valueOf(accountNumber.charAt(0)))/2 == 0 &&
                Integer.parseInt(String.valueOf(accountNumber.charAt(accountNumber.length()-1)))/2 == 0) {
                System.out.println("valid");
            } else{
                System.out.println("not valid");
            }
        }
    }

}
