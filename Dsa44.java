
// A word is considered valid if:
// It contains a minimum of 3 characters.
// It contains only digits (0-9), and English letters (uppercase and lowercase).
// It includes at least one vowel.
// It includes at least one consonant.
// You are given a string word.
// Return true if word is valid, otherwise, return false.

public class Dsa44 {

    public static boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowelCount++;
            } else if ((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') && "aeiouAEIOU".indexOf(c) == -1) {
                consonantCount++;
            }
        }

        return vowelCount > 0 && consonantCount > 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("b3"));
    }
}
