public class Dsa35 {
    public static int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 0) {
            throw new Error("Division by zero is undefined");
        }

        boolean isNegative = (dividend < 0) != (divisor < 0);

        long absdividend = Math.abs((long) dividend);
        long absdivisor = Math.abs((long) divisor);

        double quotient = 0;
        System.out.println(absdividend);
        System.out.println(absdivisor);
        while (absdividend >= absdivisor) {
            absdividend -= absdivisor;
            quotient++;
            System.out.println(quotient);
        }

        if (!isNegative && quotient > Math.pow(2, 31) - 1) {
            quotient = Math.pow(2, 31) - 1;
        }

        if (isNegative && quotient > Math.pow(2, 31)) {
            quotient = Math.pow(2, 31);
        }

        return isNegative ? -(int) quotient : (int) quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
        ;
    }
}
