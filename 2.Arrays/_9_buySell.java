public class _9_buySell {
    static void printMaxProfit(int prices[]) {
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            // bp = prices[i - 1];
            int profit = 0;
            if (bp < prices[i]) {
                profit = prices[i] - bp;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                bp = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        printMaxProfit(prices);
    }

}
