import java.text.DecimalFormat;

public class Dsa52 {
    public static double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / myPow(x, -n);
        }

        double result = 1;
        DecimalFormat df = new DecimalFormat("#.000000");
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return Double.parseDouble(df.format(result));
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
