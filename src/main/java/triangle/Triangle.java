package triangle;

import point.Point;

import java.util.StringJoiner;


/**
 * This class represents a triangle.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Triangle {

    private Point firstPoint;

    private Point secondPoint;

    private Point thirdPoint;

    private float surfaceArea;

    /**
     * Constructor.
     *
     * @since 1.0
     */
    public Triangle () {
    }

    /**
     * Constructor.
     *
     * @param firstPoint  The first {@link Point} object to set.
     * @param secondPoint The first {@link Point} object to set.
     * @param thirdPoint  The first {@link Point} object to set.
     * @since 1.0
     */
    public Triangle ( Point firstPoint, Point secondPoint, Point thirdPoint ) {
        if ( triangleIsValid ( firstPoint, secondPoint, thirdPoint ) ) {
            this.firstPoint = firstPoint;
            this.secondPoint = secondPoint;
            this.thirdPoint = thirdPoint;
        } else {
            throw new RuntimeException ( "Not a valid triangle!" );
        }
    }

    /**
     * Verifies if the {@link Triangle} build by the given {@link Point} is a valid {@link Triangle} or not.
     *
     * @param firstPoint  The first {@link Point} object to set.
     * @param secondPoint The second {@link Point} object to set.
     * @param thirdPoint  The third {@link Point} object to set.
     * @return <code>true</code> Triangle is valid.<br><code>false</code> Triangle is invalid.
     * @since 1.0
     */
    private boolean triangleIsValid ( Point firstPoint, Point secondPoint, Point thirdPoint ) {

        float surfaceArea = firstPoint.getXCoordinate () * ( secondPoint.getYCoordinate () - thirdPoint.getYCoordinate () ) +
                        secondPoint.getXCoordinate () * ( thirdPoint.getYCoordinate () - firstPoint.getYCoordinate () ) +
                        thirdPoint.getXCoordinate () * ( firstPoint.getYCoordinate () - secondPoint.getYCoordinate () );

        if ( surfaceArea <= 0 ) {
            return false;
        } else {
            this.surfaceArea = surfaceArea;
            return true;
        }
    }

    /**
     * Returns the first {@link Point} object.
     *
     * @return The first {@link Point} object.
     * @since 1.0
     */
    public Point getFirstPoint () {
        return firstPoint;
    }

    /**
     * Sets the first {@link Point} object.
     *
     * @param firstPoint The first {@link Point} object to set.
     * @since 1.0
     */
    public void setFirstPoint ( Point firstPoint ) {
        this.firstPoint = firstPoint;
    }

    /**
     * Returns the second {@link Point} object.
     *
     * @return The second {@link Point} object.
     * @since 1.0
     */
    public Point getSecondPoint () {
        return secondPoint;
    }

    /**
     * Sets the second {@link Point} object.
     *
     * @param secondPoint The second {@link Point} object.
     * @since 1.0
     */
    public void setSecondPoint ( Point secondPoint ) {
        this.secondPoint = secondPoint;
    }

    /**
     * Returns the third {@link Point} object.
     *
     * @return The third {@link Point} object.
     * @since 1.0
     */
    public Point getThirdPoint () {
        return thirdPoint;
    }

    /**
     * Sets the third {@link Point} object.
     *
     * @param thirdPoint The third {@link Point} object.
     * @since 1.0
     */
    public void setThirdPoint ( Point thirdPoint ) {
        this.thirdPoint = thirdPoint;
    }

    /**
     * Returns the values of the object in a String representation.
     *
     * @return The values of the object in a String representation.
     * @since 1.0
     */
    @Override
    public String toString () {
        return new StringJoiner ( ", ", Triangle.class.getSimpleName () + "[", "]" )
                        .add ( "\n" )
                        .add ( "firstPoint=" + firstPoint )
                        .add ( "\n" )
                        .add ( "secondPoint=" + secondPoint )
                        .add ( "\n" )
                        .add ( "thirdPoint=" + thirdPoint )
                        .add ( "\n" )
                        .add ( "surfaceArea=" + surfaceArea )
                        .toString ();
    }
}
