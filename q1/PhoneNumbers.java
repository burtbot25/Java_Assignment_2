package q1;

import java.util.Random;
import java.text.DecimalFormat;

/**
 * <p>Outputs a random phone number in the form of ###-###-####
 * with the constraints that the first 3 digits cannot be 8 or 9,
 * and the second set cannot be greater than 635.<p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class PhoneNumbers {
    
    /**
     * Limiter for each of the first 3 digits of the number (From 0-7).
     */
    static final int FIRST_LIMITER = 8;
    
    /**
     * Limiter for the second set of 3 digits of the number (From 0-635).
     */
    static final int SECOND_LIMITER = 636;
    
    /**
     * Limiter for last 4 digits of the number (From 0-9999).
     */
    static final int THIRD_LIMITER = 10000;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /**
         * Creates randomizer object.
         */
        Random random = new Random();
        
        /**
         * Randomizes digit 1.
         */
        int digit1 = random.nextInt(FIRST_LIMITER);
        
        /**
         * Randomizes digit 2.
         */
        int digit2 = random.nextInt(FIRST_LIMITER);
        
        /**
         * Randomizes digit 3.
         */
        int digit3 = random.nextInt(FIRST_LIMITER);
        
        /**
         * Formatter for at least 3 digits.
         */
        DecimalFormat threeDigits = new DecimalFormat("000");
        
        /**
         * Randomizes second set of 3 digits.
         */
        int secondDigits = random.nextInt(SECOND_LIMITER);
        
        /**
         * Formats second set of 3 digit to have at least 3 numbers.
         */
        String secondSet = threeDigits.format(secondDigits);
        
        /**
         * Formatter for at least 4 digits.
         */
        DecimalFormat fourDigits = new DecimalFormat("0000");
        
        /**
         * Randomizes last 4 numbers.
         */
        int thirdDigits = random.nextInt(THIRD_LIMITER);
        
        /**
         * Formats third set of 3 digits to have at least 4 numbers.
         */
        String thirdSet = fourDigits.format(thirdDigits);
        
        /**
         * Prints out the randomized phone number.
         */
        System.out.println(digit1 + "" + digit2 + "" + digit3 + "-"
            + secondSet + "-" + thirdSet);    
        
        /**
         * Confirms the program was ran successfully.
         */
        System.out.println("Question one was called and ran sucessfully.");
    }

};
