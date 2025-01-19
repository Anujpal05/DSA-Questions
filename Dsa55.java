public class Dsa55 {

    public static void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int i = n - 2;

        while (i >= 0) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
            i--;
        }

        if (i + 1 == 0) {
            reverse(arr, 0);
            return;
        }

        int j = n - 1;
        while (j >= i && j >= 0) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }

            j--;
        }

        reverse(arr, i + 1);
    }

    public static void reverse(int[] arr, int left) {
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        System.out.println("Before: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        nextPermutation(arr);
        System.out.println("After: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
