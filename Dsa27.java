import java.util.Scanner;

public class Dsa27 {

    public static String addBinaryString(String bin1, String bin2) {
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        int sum;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            sum = carry;
            if (i >= 0) {
                sum += bin1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += bin2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin1, bin2;
        bin1 = sc.nextLine();
        bin2 = sc.nextLine();
        String sum = addBinaryString(bin1, bin2);
        System.out.println(sum);
        sc.close();
    }
}
