import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

public class Dsa5 {

    public static void arrprint(int arr[]) {
        System.out.println("Array listed :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int search(int arr[], int d) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> dubsearch(int arr[], int d) {
        ArrayList<Integer> dubarr = new ArrayList<Integer>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                dubarr.add(i);
                flag = true;
            }
        }
        return dubarr;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 5, 2, 2, 4, 5, 6, 3, 9, 5 };
        arrprint(arr);
        int search = search(arr, 5);
        if (search == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Index of search element is " + search);
        }

        ArrayList<Integer> dubsearch = dubsearch(arr, 5);

        System.out.println("Index of search element is " + dubsearch);
    }
}
