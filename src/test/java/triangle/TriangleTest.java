package triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import point.Point;


/**
 * This class is the test class of class {@link Triangle}.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TriangleTest {

    private Triangle triangleToTest;

    /**
     * Initializing test object of type {@link Triangle}.
     *
     * @since 1.0
     */
    @BeforeEach
    public void initializeTestObject () {
        triangleToTest = new Triangle ();
    }

    /**
     * Cleaning used test object.
     *
     * @since 1.0
     */
    @AfterEach
    public void cleaningUsedTestObject () {
        triangleToTest = null;
    }

    /**
     * Verifies that if a {@link Point} is set the
     */
    @Test
    public void givenAPointObject_WhenFirstPointIsSet_ThenGetterReturnsExpectedValue () {
        Point firstPoint = new Point ( 2.0f, 3.0f );
        triangleToTest.setFirstPoint ( firstPoint );
        Assertions.assertEquals ( firstPoint, triangleToTest.getFirstPoint (), "The points have to be equal!" );
    }

    /**
     * Verifies that if the given {@link Point}s do not create a valid {@link Triangle} then a {@link RuntimeException} will be thrown.
     *
     * @since 1.0
     */
    @Test
    public void givenATriangleObject_WhenTriangleGivenByPointsIsNotValid_ThenRuntimeExceptionIsThrown () {
        Point firstPoint = new Point ( 2.0f, 3.0f );
        Point secondPoint = new Point ( 3.0f, 3.0f );
        Point thirdPoint = new Point ( 4.0f, 3.0f );
        Assertions.assertThrows ( RuntimeException.class, () -> new Triangle ( firstPoint, secondPoint, thirdPoint ),
                        "The given points do not create a valid triangle!" );
    }

    /**
     * Verifies that if the given {@link Point}s create a valid {@link Triangle} then getter are not null.
     *
     * @since 1.0
     */
    @Test
    public void givenATriangle_WhenTriangleGivenByPointsIsValid_ThenGetterAreNotNull () {
        Point firstPoint = new Point ( 0.0f, 0.0f );
        Point secondPoint = new Point ( 3.0f, 3.0f );
        Point thirdPoint = new Point ( 2.0f, 10.0f );

        Triangle createdTriangle = new Triangle ( firstPoint, secondPoint, thirdPoint );

        Assertions.assertNotNull ( createdTriangle.getFirstPoint (), "The given point is set. The return type has not to be null!" );
        Assertions.assertNotNull ( createdTriangle.getSecondPoint (), "The given point is set. The return type has not to be null!" );
        Assertions.assertNotNull ( createdTriangle.getThirdPoint (), "The given point is set. The return type has not to be null!" );
    }
}