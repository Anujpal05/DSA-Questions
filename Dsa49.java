import java.util.Arrays;

public class Dsa49 {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);

        return new String(charArray1).equals(new String(charArray2));
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        System.out.println(isAnagram(str1, str2));
    }
}