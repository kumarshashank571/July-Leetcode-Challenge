class Solution {
    public int[] singleNumber(int[] nums) {
        int xy = 0;
        for(int n : nums){
            xy ^= n;
        }
        xy &= -xy;
        int[] result = {0,0};
        for(int n : nums){
            if((xy & n)==0){result[0] ^= n;}
            else{result[1] ^=n;}
        }
        return result;
    }
}
