import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dsa13 {

    public static List<List<Integer>> sum3(int[] arr) {
        List<Integer> triplet = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();

        int i, j, k, len = arr.length;
        int sum;
        for (i = 0; i < len - 2; i++) {
            for (j = i + 1; j < len - 1; j++) {
                for (k = j + 1; k < len; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        triplet = Arrays.asList(arr[i], arr[j], arr[k]);

                        // Check if the triplet in outerList;
                        if (!ContainsTriplates(outerList, triplet)) {
                            outerList.add(triplet);
                        }
                    }
                }
            }
        }

        outerList.sort((a, b) -> {
            for (int e = 0; e < 3; e++) {
                int cmp = a.get(e).compareTo(b.get(e));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });

        return outerList;
    }

    public static boolean ContainsTriplates(List<List<Integer>> outerList, List<Integer> triplet) {
        for (List<Integer> t : outerList) {
            if (t.equals(triplet)) {
                return true;
            }
        }
        return false;
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
        List<List<Integer>> outerList = sum3(arr);
        System.out.println(outerList);
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