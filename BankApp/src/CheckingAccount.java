public class CheckingAccount extends BankAccount{

// 1. Declare Variable interestRate, is defined in Main constructor for Checking Account Object
    private Double interestRate;

// 2. Create Bank Account Object
    BankAccount account = new BankAccount();

// 3. Constructor for Checking Account
    public CheckingAccount(Double interestRate){
        this.interestRate = interestRate;
    }

// 4. Override toString thingy.
    @Override
    public String toString() {
        return "Interest Rate: " + interestRate;
    }

// 5. Method for Process Withdraw
    public void processWithdrawal(double withdraw){
        Double newBalance = account.getBalance();
           System.out.println("Overdraft: A fee of $30 has been added to your account.");

       newBalance -= withdraw + 30.00;
           System.out.println("New Balance is: $" + newBalance);
    }

// 6. Setters and Getters of interestRate, just in case.
    public void setInterestRate(Double newInterestRate){
        this.interestRate = newInterestRate;
    }

    public Double getInterestRate(){
        return interestRate;
    }

// 7. Display Account Method
    public void displayAccount(Double balance, String firstName, String lastName, int accountNumber, Double interestRate){
        System.out.print("Account Summary: " + balance + " ");
        System.out.print(firstName + " ");
        System.out.print(lastName + " ");
        System.out.print("Account# " + accountNumber + ".");
    }

}
