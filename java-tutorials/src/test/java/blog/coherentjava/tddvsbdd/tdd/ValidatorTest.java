package blog.coherentjava.tddvsbdd.tdd;

import blog.coherentjava.tddvsbdd.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Validator class using Test-Driven Development (TDD) principles.
 * <p>
 * This class contains various test cases to validate the functionality of the
 * Validator class, ensuring it correctly identifies alphanumeric strings and
 * handles edge cases such as null and empty inputs.
 */
public class ValidatorTest {

    /**
     * Add a failing test before adding any implementation.
     * There's not a big advantage in writing a test that simply forces a failure,
     * other than to act as a placeholder for your next test, after you have stubbed the implementation.
     */
    @Test
    void initialFailingTest() {
        fail("not implemented yet!");
    }

    /**
     * Add this failing test before and after the stub implementation.
     * Before the stub, it should be red. After the stub, it should be green, but it will still fail.
     * After the implementation, the test should pass. Write additional tests with various inputs to ensure that your code works as expected.
     */
    @Test
    void testWithAlphanumericInput() {
        Assertions.assertTrue(Validator.isAlphaNumeric("alpha12345"));
    }

    /**
     * Add a test for non-alphanumeric text.
     */
    @Test
    void testWithNonAlphanumericInput() {
        assertFalse(Validator.isAlphaNumeric("alpha 12345"));
    }

    /**
     * Add a test for null input.
     */
    @Test
    void testWithNullInput() {
        assertFalse(Validator.isAlphaNumeric(null));
    }

    /**
     * Add a test for an empty string.
     */
    @Test
    void testWithEmptyInput() {
        assertFalse(Validator.isAlphaNumeric(""));
    }

}
