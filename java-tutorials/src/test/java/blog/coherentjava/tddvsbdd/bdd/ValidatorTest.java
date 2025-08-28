package blog.coherentjava.tddvsbdd.bdd;

import blog.coherentjava.tddvsbdd.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Validator class demonstrating the naming conventions of Behavior Driven Development (BDD).
 * <p>
 * The naming convention is:
 * Given <context> When <action> Then <expected outcome>
 * <p>
 * For example: "Given an alphanumeric string, when we check if it's alphanumeric, then it returns true."
 * <p>
 * In this case, the context is "an alphanumeric string", the action is "we check if it's alphanumeric",
 * and the expected outcome is "it returns true".
 * <p>
 * You can use these conventions to write more descriptive names for your tests.
 * <p>
 * The advantage of using BDD-style naming conventions is that they make it easier to understand what each test is doing at a glance,
 * without having to write Javadoc comments or read through code.
 */
public class ValidatorTest {

    @Test
    void givenAlphanumericInput_whenValidate_thenReturnsTrue() {
        Assertions.assertTrue(Validator.isAlphaNumeric("alpha12345"));
    }

    @Test
    void givenNonalphanumericInput_whenValidate_thenReturnsFalse() {
        assertFalse(Validator.isAlphaNumeric("alpha 12345"));
    }

    @Test
    void givenNullInput_whenValidate_thenReturnsFalse() {
        assertFalse(Validator.isAlphaNumeric(null));
    }

    @Test
    void givenEmptyInput_whenValidate_thenReturnsFalse() {
        assertFalse(Validator.isAlphaNumeric(""));
    }

}
