package lib;
public class PasswordValidator {
    /**
     * Check the password valiable.
     * @param enter the string to create the password.
     * @return the password is valid.
     * @throws IllegalArgumentException if the password length is less than 8.
     */
        public static PasswordStrength validate(String password) {
            int minLength = 8;
            if (password.length() < minLength) {
                return PasswordStrength.INVALID;
            }
            boolean upper = false, lower = false, digit = false, special = false;
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) upper = true;
                else if (Character.isLowerCase(c)) lower = true;
                else if (Character.isDigit(c)) digit = true;
                else special = true;
            }
            int check = 0;
            if (upper) {check++;}
            if (lower) {check++;}
            if (digit) {check++;}
            if (special) {check++;}
            if (check < 2) {
                return PasswordStrength.WEAK;
            }
            else if (check == 2) {
                return PasswordStrength.MEDIUM;
            }
            else {
                return PasswordStrength.STRONG;
            }
        }
}
