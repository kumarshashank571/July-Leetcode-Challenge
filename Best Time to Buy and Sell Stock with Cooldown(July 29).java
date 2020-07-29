class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){return 0;}
        int a = 0;
        int b = -prices[0];
        int c = 0;
        for(int i = 1;i<prices.length;i++){
            int temp = a;
            a = Math.max(a,c);
            c = b+prices[i];
            b = Math.max(b,temp-prices[i]);
        }
   return Math.max(a,c);
    }
}
