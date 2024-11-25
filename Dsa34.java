// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
// '.' Matches any single character.​​​​
// '*' Matches zero or more of the preceding element.
// The matching should cover the entire input string (not partial).

// Example 1:
// Input: s = "aa", p = "a"
// Output: false
// Explanation: "a" does not match the entire string "aa".

// Example 2:
// Input: s = "aa", p = "a*"
// Output: true
// Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

// Example 3:
// Input: s = "ab", p = ".*"
// Output: true
// Explanation: ".*" means "zero or more (*) of any character (.)".

public class Dsa34 {
    public static boolean regularExpression(String s, String p) {
        return matchHelper(s, p, 0, 0);
    }

    public static boolean matchHelper(String s, String p, int i, int j) {
        if (p.length() == j) {
            return s.length() == i;
        }

        // Current character matching
        boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            // zero or more occurance
            return matchHelper(s, p, i, j + 2) || (firstMatch && matchHelper(s, p, i + 1, j));
        }

        // Normal character or .
        return firstMatch && matchHelper(s, p, i + 1, j + 1);
    }

    public static void main(String[] args) {
        System.out.println(regularExpression("aa", "a")); // false
        System.out.println(regularExpression("aa", "a*")); // true
        System.out.println(regularExpression("ab", ".*")); // true
        System.out.println(regularExpression("abcd", "d*")); // false
    }
}
