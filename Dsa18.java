// Difference between sum of the squares of first n natural numbers and square of sum

import java.util.Scanner;

public class Dsa18 {

    public static int findDiff(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int m = sum * sum;
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        int l = sum;
        return Math.abs(m - l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println(
                "Difference between sum of the squares of first n natural numbers and square of sum " + findDiff(n));
        sc.close();
    }
}
