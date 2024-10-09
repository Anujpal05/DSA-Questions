import java.util.Scanner;

class Dsa7 {

    public static int[] rearrange(int arr[]) {
        int temp;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                arr[i] = -1;
            }
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        System.out.println("Array is listed :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before rearrange:");
        printArray(arr);

        rearrange(arr);

        System.out.println("After rearrange :");
        printArray(arr);

    }
}