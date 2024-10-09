import java.util.Scanner;

class Dsa1 {

    public static void chkPair(int arr[], int n, int sum) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair with given sum is :");
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the any number :");
        int sum = sc.nextInt();
        chkPair(arr, n, sum);
        sc.close();
    }
}