class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int x : nums){
            int n = result.size();
      for(int i =0;i<n;i++){
          ArrayList<Integer> r = new ArrayList(result.get(i));
          r.add(x);
          result.add(r);
      }
        }
        return result;
    }
}
