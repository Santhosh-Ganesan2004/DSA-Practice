class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int maxv =0;
        for(int right =1;right<prices.length;right++)
        {
            if(prices[right]>prices[left])
            {
                maxv = Math.max(maxv , prices[right]-prices[left]);
            }
            else
            {
                left = right;
            }
        }
        return maxv;
        
    }
}
