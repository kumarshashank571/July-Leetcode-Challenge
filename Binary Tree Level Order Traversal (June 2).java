class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){return ans;}
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int n = qu.size();
            List<Integer> nodes = new ArrayList<>();
        for(int i =0;i<n;i++){
                TreeNode rvtx = qu.poll();
                nodes.add(rvtx.val);
                if(rvtx.left != null){qu.add(rvtx.left);}
                if(rvtx.right != null){qu.add(rvtx.right);}
             }
            ans.add(0,nodes);
        }
        return ans;
         }
}
