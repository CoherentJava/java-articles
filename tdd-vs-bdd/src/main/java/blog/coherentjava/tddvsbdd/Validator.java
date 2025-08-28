package blog.coherentjava.tddvsbdd;

public class Validator {

    public static boolean isAlphaNumeric(String s) {
        // Final version. This handles null and empty inputs correctly.
        // Return true only if s is non-null, non-empty, and all chars are letters or digits
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isAlphaNumericFirstIteration(String s) {
        // First iteration doesn't handle null input correctly
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isAlphaNumericSecondIteration(String s) {
        // Second iteration handles null but doesn't handle empty input correctly
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
