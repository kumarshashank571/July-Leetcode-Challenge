class Solution {
public:
    
    int widthOfBinaryTree(TreeNode* root) {
        if(!root){return 0;}
        int result = 1;
     queue<pair<TreeNode*,int>> q;
        q.push({root,1});
        while(!q.empty()){
         int count = q.size();
            int start = q.front().second;
            int end = q.back().second;
            result = max(result,end-start+1);
            for(int i =0;i<count;i++){
                pair<TreeNode*,int> p = q.front();
                int idx = p.second-start;  //== subtracting start to save from integer overflow because indexes                                             
                                           //== are increasing exponentially i.e 2^level.
               q.pop();
                if(p.first->left){q.push({p.first->left,2*idx});}
                if(p.first->right){q.push({p.first->right,2*idx+1});}
            }
        }
       return result;
    }
};
