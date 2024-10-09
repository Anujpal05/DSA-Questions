import java.util.Scanner;

public class Dsa4 {

    public static int[] lrotate(int arr[], int n, int d) {
        int larr[] = new int[n];
        int j = 0;
        for (int i = d; i < n; i++) {
            larr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < d; i++) {
            if (i >= 0) {
                larr[j] = arr[i];
                j++;
            }
        }

        return larr;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of d:");
        int d = sc.nextInt();
        int larr[] = new int[n];
        larr = lrotate(arr, n, d);

        System.out.println("Enter the left rotation array:");
        for (int i = 0; i < n; i++) {
            System.out.println(larr[i]);
        }

        sc.close();

    }
}
