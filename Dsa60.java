public class Dsa60 {
    public static String addBinary(String s1, String s2) {
        // code here
        int len1 = s1.length();
        int len2 = s2.length();

        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = len1 - 1;
        int j = len2 - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1101", "111"));
    }
}
