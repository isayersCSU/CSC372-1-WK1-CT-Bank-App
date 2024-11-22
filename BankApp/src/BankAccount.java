import java.util.Scanner;

// 1. Creating Class
public class BankAccount {
    private String firstName;
    private String lastName;
    private int numberOfAccounts;
    private int accountNumber = 2345;
    private Double balance = 0.00;

// 2. Constructor method BankAccount() that takes all BankAccount information.
    public BankAccount(String firstName, String lastName, int accountNumber, Double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

// 3. General Constructor because I'll be honest, variables and objects confuse me but, this seems to help somehow.
    public BankAccount() {}

// 4. Method for Deposit
    public void deposit(Double deposit) {
        balance = balance + deposit;
            System.out.println("Amount Deposited: $" + deposit);
            System.out.println("New Balance: $" + balance);
    }

// 5. Method for Withdrawal
    public void withdrawal(Double withdraw) {
        Scanner scanner = new Scanner(System.in);
            String line;

        if (balance < 0 || withdraw > balance) {
            System.out.println("Insufficient Funds");

        }
            else {
                balance -= withdraw;
                    System.out.println("Amount Withdrawn: $" + withdraw);
                    System.out.println("New Balance: $" + balance);
            }
    }

// Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setAccountID(int accountID) {
        this.accountNumber = accountID;
    }

    public int getAccountID() {
        return accountNumber;

    }

    public double getBalance() {
        return balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getDeposit() {
        return accountNumber;
    }

// Method for Displaying Account Information
    public void accountSummary(Double balance, String firstName, String lastName, int accountNumber){
        System.out.print("Account Summary: " + balance + " ");
        System.out.print(firstName + " ");
        System.out.print(lastName + " ");
        System.out.print("Account# " + accountNumber + ".");
        System.out.println();
    }

// Override for toString, need more info on what exactly this does.
    @Override
    public String toString() {
        return "First: " + firstName + ", Last: " + lastName + "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

