package q2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>Accepts the radius and height values from the user and
 * calculates the surface area and the volume of a cylinder.</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class CylinderStats {
    
    /**
     * Square for the calculation.
     */
    public static final int SQUARE = 2;
    
    /**
     * Coefficient to calculate surface area.
     */
    public static final int SA_COEFFICIENT = 2;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        /**
         * Creates scanner object.
         */
        Scanner scan = new Scanner(System.in);
        
        /**
         * Formats to 4 decimal places.
         */
        DecimalFormat fmt = new DecimalFormat("0.0000");
        
        /**
         * Prompts user for radius input.
         */
        System.out.println("Please enter the radius of the cylinder: ");
        
        /**
         * Reads radius input.
         */
        double r = scan.nextDouble();
        
        /**
         * Prompts user for height input.
         */
        System.out.println("Please enter the height of the cylinder: ");
        
        /**
         * Reads height input.
         */
        double h = scan.nextDouble();
        
        /**
         * Calculates surface area.
         */
        double surfaceArea = SA_COEFFICIENT * Math.PI * r * (r + h);
        
        /**
         * Formats surface area to 4 decimal places.
         */
        String formattedSA = fmt.format(surfaceArea);
        
        /**
         * Calculates and formats volume.
         */
        double volume = Math.PI * Math.pow(r, SQUARE) * h;
        
        /**
         * Formats the volume to 4 decimal places.
         */
        String formattedV = fmt.format(volume);
        
        /**
         * Prints surface area of the cylinder.
         */
        System.out.println("Your surface area is: " + formattedSA);
        
        /**
         * Prints volume of the cylinder.
         */
        System.out.println("Your volume is: " + formattedV);
        
        /**
         * Confirms the program was ran successfully.
         */
        System.out.println("Question two was called and ran sucessfully.");
        
        /**
         * Closes scanner.
         */
        scan.close();
    }

};
