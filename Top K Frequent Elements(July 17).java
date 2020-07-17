class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      if(nums.length == k){return nums;}   
        int[] result = new int[k];
        Map<Integer,Integer> counts = new HashMap();
        for(int x:nums){
            counts.put(x,counts.getOrDefault(x,0)+1);
        }
        
       Queue<Integer> pq = new PriorityQueue<>((a,b) -> counts.get(b) - counts.get(a));
        for(int x:counts.keySet()){pq.add(x);}
    for(int i =0;i<k;i++){
        result[i] = pq.poll();
    }
        return result;
    }
}
