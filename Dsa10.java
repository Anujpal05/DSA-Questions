//Product of all prime number in array

import java.util.Scanner;

public class Dsa10 {

    public static int producOfPrimeNum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int product = 1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                flag = true;
                product = product * nums[i];
            }
        }

        if (flag == false) {
            return 0;
        }

        return product;
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
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

        int productOfPrime = producOfPrimeNum(arr);
        System.out.println("Product of prime number is :" + productOfPrime);
        sc.close();
    }
}