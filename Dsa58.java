public class Dsa58 {
    public static int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int profit = 0;
        int entryPrice = 0;
        boolean isBuy = false;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < prices[i + 1] && !isBuy) {
                isBuy = true;
                entryPrice = prices[i];
            } else if (prices[i] > prices[i + 1] && isBuy) {
                isBuy = false;
                profit += (prices[i] - entryPrice);
                entryPrice = 0;
            }
        }

        if (isBuy) {
            profit += (prices[n - 1] - entryPrice);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maximumProfit(prices));
    }
}
