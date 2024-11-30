public class Dsa39 {

    public static int fibonachi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static int[] fibArray(int n) {
        int fib[] = new int[n];
        for (int i = 0; i < n; i++) {
            fib[i] = fibonachi(i);
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] fib = fibArray(n);
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }

    }
}
