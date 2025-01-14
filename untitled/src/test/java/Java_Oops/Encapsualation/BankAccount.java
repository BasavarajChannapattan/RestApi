package Java_Oops.Encapsualation;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private String holderName;



    public BankAccount(String accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    //deposit money

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void  withdrawal(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("new balance: " + balance);
        }
        else
        {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 1000.0);
        account1.deposit(500.0);
        account1.withdrawal(200.0);
        System.out.println("Account Balance: " + account1.getBalance());
    }

}
