//3 Sum means set of all 3 element in array whose sum is 0

import java.util.Scanner;

public class Dsa11 {

    public static void sum3(int[] arr) {
        int i, j, k;
        int sum = 0;
        boolean flag = false;
        for (i = 0; i < arr.length - 2; i++) {
            for (j = i + 1; j < arr.length - 1; j++) {
                for (k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        flag = true;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("Not Exist");
        }
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

        sum3(arr);
        sc.close();
    }
}

// array : 0 1 4 3 5
// 0 1 4
// 0 1 3
// 0 1 5
// 0 4 3
// 0 4 5
// 0 3 5

// 1 4 3
// 1 4 5
// 1 3 5

// 4 3 5
