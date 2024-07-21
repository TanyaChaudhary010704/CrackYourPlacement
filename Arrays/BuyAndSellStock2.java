package Arrays;

public class BuyAndSellStock2 {
  public static void main(String[] args) {
    int nums[] = { 7,1,5,3,6,4};
    Solution s = new Solution();
    System.out.println(s.maxProfit(nums));
  }
}
class Solution {
  public int maxProfit(int[] prices) {
      int profit =0;
      for(int i=1;i<prices.length;i++){
          if(prices[i-1]<prices[i]){
              profit +=prices[i]-prices[i-1];
          }
      }
      return profit;
  }
}
