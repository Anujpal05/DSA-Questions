import java.util.Scanner;

public class Dsa8 {

    public static int[] productExceptSelf(int[] arr) {
        int[] prod = new int[arr.length];
        int product;
        for (int i = 0; i < arr.length; i++) {
            product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                product = product * arr[j];
            }
            prod[i] = product;
        }
        return prod;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] productArray = productExceptSelf(arr);
        System.out.println("Product Array is :");
        for (int i = 0; i < n; i++) {
            System.out.println(productArray[i]);
        }
        sc.close();
    }
}
