import java.util.Scanner;

public class Main {                                                         // 1. Entry Point

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                           // 2. Scanner for Reading in Main

            String name1;                                                   // 3. Declare Variables for the Scanner to Use
            String name2;

        BankAccount Account = new BankAccount();                            // 4. Create Bank Account Object
        CheckingAccount checks = new CheckingAccount(0.025);    // 5. Create Checking Account Object

        System.out.print("\n");                                             // 6. Reoccurring Formatting Line to Make Output More Readable (Same Basically Everywhere)
        System.out.print("Enter First Name: ");                             // 7. Prompt for User First Name
            name1 = scanner.next();                                         // 8. Defining Previously Declared Variable (name1) as the Next Scanner Input

        System.out.print("\n");
        System.out.print("Enter Last Name: ");                              // 9. Prompt for User Last Name
            name2 = scanner.next();                                         // 10. ||8|| (name2) as the Next Scanner Input

        Account.setFirstName(name1);                                        // 11. Setters (Mutator) setFirstName and setLastName. Methods Defined in BankAccount Class, Used to Access Private Variables Within Class
        Account.setLastName(name2);                                         // Note: Learn more about why private variables are important. Ostensibly, due to security or possibly mutability concerns.
                                                                            // Note: Encapsulation: (GeeksForGeeks) Encapsulation can be achieved by declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
        System.out.print("\n");                                             // Note: Encapsulation: (Self) Seems more related to the concepts of security and privacy mentioned prior. Practical example is hiding hash methods used to store passwords.
        System.out.print(Account.getFirstName()); // Print Lines            // Note: Abstraction: (GeeksForGeeks) Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user.
        System.out.println("\n");                 // Not Technically        // Note: Abstraction: (Self) May have confused my previous example with this for the hash method application. Abstractions seems to be the obfuscation of the code whereas Encapsulation refers specifically to the method in which the process of Abstraction is carried out i.e. the use of private variables, setters and getters.
        System.out.print(Account.getLastName());  // Necessary
        System.out.print("\n");                   // Mainly testing getters for input.
        System.out.print("\n");
        System.out.println("1. Withdrawal 2. Deposit");                     // 12. Prompt for Withdrawal or Deposit. Cont. 9
            int option = scanner.nextInt();                                 // 13. Defining variable (option) as the next Int Input for Scanner.
            if (option == 1) {                                              // 14. If statement for Withdrawal and Process Withdrawal Functions, gives an option for the method processWithdrawal() on Ln. 43.

                System.out.print("How Much Would You Like to Withdraw: $ ");                       // Skip to Ln. 43.
                    Double amount = scanner.nextDouble();                                          // ||
                                                                                                   // ||
                System.out.println("Are you withdrawing from checking account?: (y) or (n)");      // ||
                    String yon = scanner.next();                                                   // ||

                        if (yon.equals("y")){                                // 15. If statement to trigger processWithdrawal() below.
                            checks.processWithdrawal(amount);
                        }

                        else if(yon.equals("n")) {                           // 16. Warning that the Request will not be processed in this case as the following withdrawal() method cannot overdraft the account in the same was as process withdrawal
                            System.out.println("Can't Process request");
                        }

                Account.withdrawal(amount);                                    // 17. Activation of withdrawal() method.

            }

            else {                                                           // 18. Else Statement, initialized Ln. 35. Gives Option to Deposit
            System.out.print("How Much Would You Like to Deposit: $ ");
            Account.deposit(scanner.nextDouble());
            }                                                                //     |
                                                                             // 19. V  Method accountSummary to finish things up.
            Account.accountSummary(Account.getBalance(), Account.getFirstName(), Account.getLastName(), Account.getAccountID());
            checks.displayAccount(Account.getBalance(), Account.getFirstName(), Account.getLastName(), Account.getAccountID(), checks.getInterestRate());
    }                                                                        // 20. Knew I'd use the interest rate getter for something!
}