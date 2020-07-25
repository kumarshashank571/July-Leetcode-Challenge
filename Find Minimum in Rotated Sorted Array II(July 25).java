  class Solution {
    public int findMin(int[] nums) {
        int min = (int)1e8;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){min=nums[i];}
        }
        return min;
    }
}
