public class Dsa28 {
    public static String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        char pre = s.charAt(0);
        str.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            if (pre == s.charAt(i + 1)) {
                count++;
            } else {
                count = 0;
            }
            if (count < 2) {
                str.append(s.charAt(i + 1));
            }
            pre = s.charAt(i + 1);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }
}
