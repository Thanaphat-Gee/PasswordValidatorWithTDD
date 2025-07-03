package lib;
public class PasswordValidatorTest{
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        PasswordStrength result2 = PasswordValidator.validate("thanaphat");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Weak Password.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }
        PasswordStrength result3 = PasswordValidator.validate("Thanaphat");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Medium Password.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }
        PasswordStrength result4 = PasswordValidator.validate("Thanaphat34!");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 1 Passed: Strong Password.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected STRONG but got " + result4);
        }
        System.out.println("--------------------------------");
    }
}
