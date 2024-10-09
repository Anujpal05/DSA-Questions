// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

import java.util.Scanner;

public class Dsa15 {

    public static int minDiff(int arr[], int m) {
        if (arr.length - 1 < m) {
            return -1;
        }
        int[] sortArray = sort(arr);
        int min = sortArray[m - 1] - sortArray[0];
        for (int i = 0; i < sortArray.length + 1 - m; i++) {
            if ((sortArray[i + m - 1] - sortArray[i]) < min) {
                min = sortArray[i + m - 1] - sortArray[i];
            }
        }
        return min;
    }

    public static int[] sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
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
        System.out.println("Enter the no. of student:");
        int m = sc.nextInt();
        int min = minDiff(arr, m);
        System.out.println("Minimum difference is :" + min);
        sc.close();
    }
}
