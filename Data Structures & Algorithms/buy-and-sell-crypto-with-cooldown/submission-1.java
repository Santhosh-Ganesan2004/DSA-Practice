class Solution {
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        if(n==0 || n==1)
        {
            return 0;
        }
        int profit = 0;    
        int[] buy = new int[n];
        int[] sell = new int[n];
        int[] keep = new int[n];

        buy[0] = -prices[0];
        sell[0] =0;
        keep[0] =0;
        for(int i =1;i<n;i++)
        {
            buy[i]=Math.max(buy[i-1],keep[i-1]-prices[i]);
            sell[i] = buy[i-1] + prices[i];
            keep[i] = Math.max(keep[i-1],sell[i-1]);
        }
        return Math.max(sell[n-1],keep[n-1]);        
    }
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }

        System.out.println(maxProfit(prices));
    }
}
