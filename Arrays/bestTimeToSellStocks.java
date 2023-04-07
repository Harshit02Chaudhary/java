package Arrays;

public class bestTimeToSellStocks {
    
}
class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int ans = 0, profit = 0;
        for(int i=0; i<prices.length; i++){
            int curprice = prices[i];
            
            if(buyprice > curprice){
                buyprice = curprice;
            }
            else{
                profit = curprice - buyprice;
                ans = Math.max(profit, ans);
            }
            
        }
        return ans;
    }
}