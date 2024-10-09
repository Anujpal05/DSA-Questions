public class Dsa6 {
    // bubble sort
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        int j, key, temp;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                }
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 9, 5, 4, 8, 6, 1, 0, -5 };

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

        System.out.println("Array sorted :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
