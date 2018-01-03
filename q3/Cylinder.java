package q3;

/**
 * Creates a Cylinder class.
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Cylinder {
    
    /**
     * Square for the calculation.
     */
    private static final int SQUARE = 2;
    
    /**
     * Coefficient to calculate surface area.
     */
    private static final int SA_COEFFICIENT = 2;
    
    /**
     * Radius of the cylinder.
     */
    private double radius;
    
    /**
     * Height of the cylinder.
     */
    private double height;
    
    /**
     * Constructs an object of type Cylinder.
     * @param radius a double.
     * @param height a double.
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Returns the radius for this Cylinder.
     * @return radius as a double.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the height for this Cylinder.
     * @return height as a double.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the radius for this Cylinder.
     * @param radius the radius to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Sets the height for this Cylinder.
     * @param height the height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns the surface area of the cylinder.
     * @return surfaceArea as a double.
     */
    public double getSurfaceArea() {
        double surfaceArea = SA_COEFFICIENT * Math.PI 
            * radius * (radius + height);
        return surfaceArea;
    }
    
    /**
     * Returns the volume of the cylinder.
     * @return volume as a double.
     */
    public double getVolume() {
        double volume = Math.PI * Math.pow(radius, SQUARE) * height;
        return volume;
    }

    /**
     * Returns a String representation of the cylinder's state.
     * @return Cylinder as a String.
     */
    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + "]";
    }
    
};
