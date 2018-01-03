package q3;

/**
 * <p>A driver class that instantiates and updates two Cylinder objects, 
 * printing their radius and height before and after modification, and 
 * prints the final volume and surface area of each cylinder.</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class MultiCylinder {
    
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
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /**
         * Creates first cylinder.
         */
        Cylinder cylinder1 = new Cylinder(TEST_VALUE1, TEST_VALUE2);
        
        /**
         * Prints statistics of cylinder 1.
         */
        System.out.println("The first cylinder's stats: " 
            + cylinder1.toString());
        
        /**
         * Creates second cylinder.
         */
        Cylinder cylinder2 = new Cylinder(TEST_VALUE3, TEST_VALUE4);
        
        /**
         * Prints statistics of cylinder 2.
         */
        System.out.println("The second cylinder's stats: " 
            + cylinder2.toString());
        
        /**
         * Sets new radius value for cylinder 1.
         */
        cylinder1.setRadius(TEST_VALUE4);
        
        /**
         * Sets new height value for cylinder 1.
         */
        cylinder1.setHeight(TEST_VALUE3);
        
        /**
         * Sets new radius value for cylinder 2.
         */
        cylinder2.setRadius(TEST_VALUE2);
        
        /**
         * Sets new height value for cylinder 2.
         */
        cylinder2.setHeight(TEST_VALUE1);
        
        /**
         * Let's the user know that the values have changed.
         */
        System.out.println("Your two cylinders' values have changed!");
        
        /**
         * Prints the new values of Cylinder 1.
         */
        System.out.println("Cylinder 1 now has a radius of " 
            + cylinder1.getRadius() + " and a height of " 
                + cylinder1.getHeight());
        
        /**
         * Prints the new values of Cylinder 2.
         */
        System.out.println("Cylinder 2 now has a radius of " 
            + cylinder2.getRadius() + " and a height of " 
                + cylinder2.getHeight());
        
        /**
         * Prints new surface area for cylinder 1.
         */
        System.out.println("The surface area of cylinder 1 is now: " 
            + cylinder1.getSurfaceArea());
        
        /**
         * Prints new surface area for cylinder 2.
         */
        System.out.println("The surface area of cylinder 2 is now: " 
            + cylinder2.getSurfaceArea());
        
        /**
         * Prints new volume for cylinder 1.
         */
        System.out.println("The volume of cylinder 1 is now: " 
            + cylinder1.getVolume());
        
        /**
         * Prints new volume for cylinder 2.
         */
        System.out.println("The volume of cylinder 2 is now: " 
            + cylinder2.getVolume());

        /**
         * Confirms the program was ran successfully.
         */
        System.out.println("Question three was called and ran sucessfully.");
    }

};
