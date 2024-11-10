public class Dsa26 {

    public static String addBinaryString(String bin1, String bin2) {
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            if (bin1.charAt(i) == '0' && bin2.charAt(j) == '0') {
                if (carry == 1) {
                    sum.insert(0, '1');
                    carry = 0;
                } else {
                    sum.insert(0, '0');
                }
            }
            if (bin1.charAt(i) == '0' && bin2.charAt(j) == '1') {
                if (carry == 1) {
                    sum.insert(0, '0');
                    carry = 1;
                } else {
                    sum.insert(0, '1');
                }
            }

            if (bin1.charAt(i) == '1' && bin2.charAt(j) == '0') {
                if (carry == 1) {
                    sum.insert(0, '0');
                    carry = 1;
                } else {
                    sum.insert(0, '1');
                }
            }

            if (bin1.charAt(i) == '1' && bin2.charAt(j) == '1') {
                if (carry == 1) {
                    sum.insert(0, '1');
                    carry = 1;
                } else {
                    sum.insert(0, '0');
                    carry = 1;
                }
            }
            i--;
            j--;
        }

        while (i >= 0) {
            if (carry == 1) {
                if (bin1.charAt(i) == '0') {
                    sum.insert(0, '1');
                    carry = 0;
                } else {
                    sum.insert(0, '0');
                    carry = 1;
                }
            } else {
                sum.insert(0, bin1.charAt(i));
            }
            i--;
        }

        while (j >= 0) {
            if (carry == 1) {
                if (bin2.charAt(j) == '0') {
                    sum.insert(0, '1');
                    carry = 0;
                } else {
                    sum.insert(0, '0');
                    carry = 1;
                }
            } else {
                sum.insert(0, bin2.charAt(j));
            }
            j--;
        }

        if (carry == 1) {
            sum.insert(0, "1");
        }

        return sum.toString();

    }

    public static void main(String[] args) {
        System.out.println(addBinaryString("100", "110010"));
    }
}
