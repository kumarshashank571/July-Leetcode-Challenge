class Solution {
    
    //=== brute approach 
    // public int arrangeCoins(int n) {
    //     int i = 1;
    //     int count = 0;
    //     while(i<=n){
    //         count += 1;
    //         n = n-i;
    //         i++;
    //     }
    //    return count;
    // }
    
    //== now optimizing the solution using some mathematical manipulation
    public int arrangeCoins(int n) {
     long k = (long)Math.sqrt(2*(long)n);
        long sum = k*(k+1)/2;
        if(sum>n){return (int)k-1;}
        return (int)k;
    }
}
