package za.co.mocoder;

public class Fundamentals {

    // ============================
    // Question 1
    // ============================
    public static boolean stayCalm(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i * i;
        }

        return total % 5 == 0;
    }

    // ============================
    // Question 2
    // ============================
    public static void countUpOdd(int n) {

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    // ============================
    // Question 3
    // ============================
    public static String checkPassphrase(String passphrase) {

        if (passphrase == null || passphrase.trim().isEmpty()) {
            return "Invalid";
        }

        if (passphrase.length() < 8) {
            return "Weak";
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        for (char c : passphrase.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("@#$%&*?".indexOf(c) >= 0) {
                hasSymbol = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSymbol) {
            return "Strong";
        } else if (hasUpper && hasLower && hasDigit) {
            return "Medium";
        } else {
            return "Weak";
        }
    }

    // ============================
    // Question 4
    // ============================
    public static String capitaliseWords(String sentence) {

        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1).toLowerCase());

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
