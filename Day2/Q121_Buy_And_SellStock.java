package Day2;

public class Q121_Buy_And_SellStock {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int x:prices)
        {
            min=Math.min(min,x);
            maxProfit=Math.max(maxProfit,(x-min));
        }
        return maxProfit;
    }
}
