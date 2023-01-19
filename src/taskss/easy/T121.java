package taskss.easy;

public class T121 {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        int size =prices.length;
        for (int i = 0; i < (size) ; i++) {
            buy = Math.min(buy,prices[i]);
            profit= Math.max(profit,prices[i]-buy);

        }

        return profit;
    }

}
