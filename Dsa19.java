
//Multiplication table
import java.util.Scanner;

public class Dsa19 {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Table of  " + n);
        table(n);
        sc.close();
    }
}
