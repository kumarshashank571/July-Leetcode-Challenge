class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int i = 0;      //2's pointer
        int j = 0;      //3's pointer
        int k = 0;      //5's pointer
        dp[0] = 1;
        for(int x = 1;x<n;x++){
            dp[x] = Math.min(dp[i]*2,Math.min(dp[k]*5,dp[j]*3));
            if(dp[x] == dp[i]*2){i++;}
            if(dp[x] == dp[j]*3){j++;}
            if(dp[x] == dp[k]*5){k++;}
            
        }
        return dp[n-1];
    }
}
