public class Dsa40 {
    public static boolean isValidNum(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        int i = 0;
        int n = s.length();

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }

        boolean hasDigits = false;
        while (i < n && Character.isDigit(s.charAt(i))) {
            hasDigits = true;
            i++;
        }

        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                hasDigits = true;
                i++;
            }
        }

        if (!hasDigits) {
            return false;
        }

        if (i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;

            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                i++;
            }

            boolean hasExponentDigits = false;
            while (i < n && Character.isDigit(s.charAt(i))) {
                hasExponentDigits = true;
                i++;
            }

            if (!hasExponentDigits) {
                return false;
            }
        }
        return i == n;
    }

    public static void main(String[] args) {
        String str = "53.5e943";
        if (isValidNum(str)) {
            System.out.println("String is valid!");
        } else {
            System.out.println("String is not valid!");
        }
    }
}
