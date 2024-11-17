public class Dsa32 {
    // Bubble sort
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;
        boolean swapped = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < n - mid; j++) {
            right[j] = arr[j + mid];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 54, 13, 50, 51, 8, 14 };
        print(arr);
        int[] arr1 = arr.clone();
        long start1 = System.nanoTime();
        bubbleSort(arr1);
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);
        print(arr1);

        int[] arr2 = arr.clone();
        long start2 = System.nanoTime();
        insertionSort(arr2);
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
        print(arr2);

        int[] arr3 = arr.clone();
        long start3 = System.nanoTime();
        selectionSort(arr3);
        long end3 = System.nanoTime();
        System.out.println(end3 - start3);
        print(arr3);

        int[] arr4 = arr.clone();
        long start4 = System.nanoTime();
        mergeSort(arr4);
        long end4 = System.nanoTime();
        System.out.println(end4 - start4);
        print(arr4);
    }
}

// Output
// 2 54 13 50 51 8 14
// 7400
// 2 8 13 14 50 51 54
// 8300
// 2 8 13 14 50 51 54
// 8200
// 2 8 13 14 50 51 54
// 16300
// 2 8 13 14 50 51 54
