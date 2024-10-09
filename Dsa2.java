import java.util.Scanner;

class Dsa2 {

    // public static void profit(int price[], int n) {
    // int min = 0;
    // for (int i = 1; i < n - 1; i++) {
    // if (price[min] > price[i]) {
    // price[min] = price[i];
    // }
    // }

    // int max = min + 1;
    // for (int i = max + 1; i < n; i++) {
    // if (price[max] < price[i]) {
    // max = i;
    // }
    // }

    // System.out.println(price[max] - price[min]);
    // }

    public static void profit(int price[], int n) {
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (price[j] - price[i] > maxProfit) {
                    maxProfit = price[j] - price[i];
                }
            }
        }

        System.out.println("Maximum Profit is " + maxProfit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of day:");
        int n = sc.nextInt();

        int price[] = new int[n];
        System.out.println("Enter the price according to day:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        profit(price, n);
        sc.close();
    }
}