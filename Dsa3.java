import java.util.Scanner;

public class Dsa3 {

    public static void dublicate(int arr[], int n) {
        boolean flag = false;
        System.out.println("Dublicate number is :");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + "  ");
                    flag = true;
                }
            }
        }

        if (flag == false) {
            System.out.print("Not Exist!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dublicate(arr, n);
        sc.close();
    }
}
