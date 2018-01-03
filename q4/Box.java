package q4;

/**
 * <p>Creates a Box class.</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class Box {
    
    /**
     * Height of the box.
     */
    private double height;
    
    /**
     * Width of the box.
     */
    private double width;
    
    /**
     * Depth of the box.
     */
    private double depth;
    
    /**
     * If box is full or not.
     */
    private boolean full;
    
    /**
     * Constructs an object of type Box which is initially NOT full.
     * @param height a double.
     * @param width a double.
     * @param depth a double.
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }

    /**
     * Returns the height for this Box.
     * @return height a double.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the width for this Box.
     * @return width a double.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the depth for this Box.
     * @return depth a double.
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Returns true if the box is full and false if not.
     * @return full a boolean.
     */
    public boolean isFull() {
        return full;
    }

    /**
     * Sets the height for this Box.
     * @param height the height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Sets the width for this Box.
     * @param width the width to set.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the depth for this Box.
     * @param depth the depth to set.
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Sets the fullness for this Box.
     * @param full the full to set.
     */
    public void setFull(boolean full) {
        this.full = full;
    }

    /**
     * Returns a String representation of the Box.
     * @return Box as a String.
     */
    @Override
    public String toString() {
        return "Box [height=" + height + ", width=" + width 
            + ", depth=" + depth + ", full=" + full + "]";
    }
    
};
