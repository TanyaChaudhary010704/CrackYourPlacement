package Arrays;

class Solution {
  public int maxProfit(int[] prices) {
    int buyingPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyingPrice < prices[i]) {
        int profit = prices[i] - buyingPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyingPrice = prices[i];
      }
    }
    return maxProfit;
  }
}

public class BuyAndSellStock {
  public static void main(String[] args) {
    int nums[] = { 7,1,5,3,6,4};
    Solution s = new Solution();
    System.out.println(s.maxProfit(nums));
  }
}
