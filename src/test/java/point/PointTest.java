package point;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * This class is a test class for class {@link Point}
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class PointTest {

    Point pointToTest;

    /**
     * Initializing test object of type {@link Point}.
     *
     * @since 1.0
     */
    @BeforeEach
    public void initializeTestObject () {
        pointToTest = new Point ( 2f, 3f );
    }

    /**
     * Cleaning used test object.
     *
     * @since 1.0
     */
    @AfterEach
    public void cleaningUsedTestObject () {
        pointToTest = null;
    }

    /**
     * Verifies that if the x coordinate is set the {@link Point#getXCoordinate()} returns expected value.
     *
     * @since 1.0
     */
    @Test
    public void givenAPointObject_WhenXCoordinateIsSet_ThenGetterReturnsExpectedValue () {
        pointToTest.setXCoordinate ( 3.0f );
        Assertions.assertEquals ( 3.0, pointToTest.getXCoordinate (), "The x coordinate has to be [ 3.0 ]." );
    }

    /**
     * Verifies that if the y coordinate is set the {@link Point#getYCoordinate()} returns expected value.
     *
     * @since 1.0
     */
    @Test
    public void givenAPointObject_WhenYCoordinateIsSet_ThenGetterReturnsExpectedValue () {
        pointToTest.setYCoordinate ( 2.0f );
        Assertions.assertEquals ( 2.0f, pointToTest.getYCoordinate (), "The y coordinate has to be [ 2.0 ]." );
    }
}
