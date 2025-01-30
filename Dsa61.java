import java.util.Arrays;

public class Dsa61 {
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 != len2) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
    }
}
