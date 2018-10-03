import java.util.Random;
/** CHECKINGS
 * SAVINGS
 * STUDENT
 * WORKPLACE
 */

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    //to call static method(??) just do class.name to call...
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * CHECKINGS,
     * SAVINGS,
     * STUDENT,
     * WORKPLACE
     */
    /**
     *
     */

    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     * private
     */

    /**
     *
     */
    /**
     *
     */
    public BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    public double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name
     * @param accountCategory
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
//make a getter to look at account balance
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
    return getAccountBalance();
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getInterestEarned() {
        return interestEarned;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
