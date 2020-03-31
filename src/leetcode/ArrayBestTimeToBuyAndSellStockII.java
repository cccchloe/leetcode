package leetcode;

public class ArrayBestTimeToBuyAndSellStockII{
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0){
            return 0;
        }
        int prof = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i] < prices[i + 1]){
                prof += (prices[i + 1] - prices[i]);
            }
        }
        return prof;
    }
}