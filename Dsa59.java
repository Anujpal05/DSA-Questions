public class Dsa59 {
    public static int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        int maxProfit = 0;
        boolean isBuy = false;
        int entryPrice = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < prices[i + 1] && !isBuy) {
                isBuy = true;
                entryPrice = prices[i];
            } else if (prices[i] > prices[i + 1] && isBuy) {
                isBuy = false;
                maxProfit = Math.max(maxProfit, prices[i] - entryPrice);
                entryPrice = 0;
            }
        }

        if (isBuy) {
            maxProfit = Math.max(maxProfit, prices[n - 1] - entryPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maximumProfit(prices));
    }
}
