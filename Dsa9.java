import java.util.ArrayList;
import java.util.Scanner;

public class Dsa9 {

    public static ArrayList<Integer> distinctPrimeFactor(int[] arr) {
        int productOfArray = productOfArray(arr);
        ArrayList<Integer> factorArray = factorArray(productOfArray);
        return factorArray;
    }

    public static boolean primeNum(int num) {
        boolean flag = true;
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static ArrayList<Integer> factorArray(int num) {
        int temp = num;
        int i = 1;
        ArrayList<Integer> primeFact = new ArrayList<Integer>();
        while (temp > 0) {
            if (temp % i == 0 && primeNum(i)) {
                primeFact.add(i);
            }
            temp = temp / i;
            i++;
        }
        return primeFact;
    }

    public static int productOfArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        return product;
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
        System.out.println("Prime number of product of array is:");
        ArrayList<Integer> primenum = distinctPrimeFactor(arr);
        for (int i = 0; i < primenum.size(); i++) {
            System.out.println(primenum.get(i));
        }
        sc.close();
    }
}
