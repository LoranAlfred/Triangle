package point;

import java.util.StringJoiner;


/**
 * This class represents a point.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Point {

    private float xCoordinate;

    private float yCoordinate;

    /**
     * Constructor.
     *
     * @since 1.0
     */
    public Point () {
    }

    /**
     * Constructor.
     *
     * @param xCoordinate The x coordinate to set.
     * @param yCoordinate The y coordinate to set.
     * @since 1.0
     */
    public Point ( float xCoordinate, float yCoordinate ) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the x coordinate.
     *
     * @return The x coordinate.
     * @since 1.0
     */
    public float getXCoordinate () {
        return xCoordinate;
    }

    /**
     * Sets the x coordinate.
     *
     * @param xCoordinate The x coordinate to set.
     * @since 1.0
     */
    public void setXCoordinate ( float xCoordinate ) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Returns the y coordinate.
     *
     * @return The y coordinate.
     * @since 1.0
     */
    public float getYCoordinate () {
        return yCoordinate;
    }

    /**
     * Sets the y coordinate.
     *
     * @param yCoordinate The y coordinate to set.
     * @since 1.0
     */
    public void setYCoordinate ( float yCoordinate ) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A String representation of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        return new StringJoiner ( ", ", Point.class.getSimpleName () + "[", "]" )
                        .add ( "\n" )
                        .add ( "xCoordinate=" + xCoordinate )
                        .add ( "\n" )
                        .add ( "yCoordinate=" + yCoordinate )
                        .add ( "\n" )
                        .toString ();
    }
}
