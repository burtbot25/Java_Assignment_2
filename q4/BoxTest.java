package q4;

/**
 * <p>A driver class that instantiates and updates two Box objects
 * and prints out the values before and after modification. This class
 * uses each method of the Box class.</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class BoxTest {
    
    /**
     * Tester value 1.
     */
    public static final double TEST_VALUE1 = 1;
    
    /**
     * Tester value 2.
     */
    public static final double TEST_VALUE2 = 2;
    
    /**
     * Tester value 3.
     */
    public static final double TEST_VALUE3 = 3;
    
    /**
     * Tester value 4.
     */
    public static final double TEST_VALUE4 = 4;
    
    /**
     * Tester value 5.
     */
    public static final double TEST_VALUE5 = 5;
    
    /**
     * Tester value 6.
     */
    public static final double TEST_VALUE6 = 6;
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /**
         * Creates the first box object.
         */
        Box box1 = new Box(TEST_VALUE1, TEST_VALUE2, TEST_VALUE3);
        
        /**
         * Creates the second box object.
         */
        Box box2 = new Box(TEST_VALUE4, TEST_VALUE5, TEST_VALUE6);
        
        /**
         * Prints the current values of box 1.
         */
        System.out.println("Box 1's values are: " + box1.toString());
        
        /**
         * Prints the current values of box 2.
         */
        System.out.println("Box 2's values are: " + box2.toString());
        
        /**
         * Sets new height value for box 1.
         */
        box1.setHeight(TEST_VALUE6);
        
        /**
         * Sets new width value for box 1.
         */
        box1.setWidth(TEST_VALUE5);
        
        /**
         * Sets new depth value for box 1.
         */
        box1.setDepth(TEST_VALUE4);
        
        /**
         * Sets new fullness value for box 1.
         */
        box1.setFull(true);
        
        /**
         * Sets new height value for box 2.
         */
        box2.setHeight(TEST_VALUE3);
        
        /**
         * Sets new width value for box 2.
         */
        box2.setWidth(TEST_VALUE2);
        
        /**
         * Sets new depth value for box 2.
         */
        box2.setDepth(TEST_VALUE1);
        
        /**
         * Sets new fullness value for box 2.
         */
        box2.setFull(true);
        
        /**
         * Let's the user know that the values have changed.
         */
        System.out.println("Your boxes have new values!");
        
        /**
         * Prints the new values of box 1.
         */
        System.out.println("Box 1 now has a height of " + box1.getHeight() 
            + ", a width of " + box1.getWidth() + ", a depth of " 
                + box1.getDepth() + ", and its fullness is now " 
                    + box1.isFull());
        /**
         * Prints the new values of box 2.
         */
        System.out.println("Box 2 now has a height of " + box2.getHeight() 
            + ", a width of " + box2.getWidth() + ", a depth of " 
                + box2.getDepth() + ", and its fullness is now " 
                    + box2.isFull());
        
        /**
         * Confirms the program was ran successfully.
         */
        System.out.println("Question four was called and ran sucessfully.");
    }

};
