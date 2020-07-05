class Solution {
    // it is a typical bits manipulation question.
    public int hammingDistance(int x, int y) {
       int result = x^y;     // taking xor of both numbers only the different bits will remain.
        int count = 0;
        while(result>0){
            count += result & 1;
            result >>= 1;
        }
        return count;
    }
}
