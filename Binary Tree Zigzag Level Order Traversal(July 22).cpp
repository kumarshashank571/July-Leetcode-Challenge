class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if(root == nullptr){return {};}
        vector<vector<int>> result;
        deque<TreeNode*> q;
        q.push_back(root);
        bool reverse = true;
        while(!q.empty()){
            int count = q.size();
            vector<int> levelnodes;
            deque<TreeNode*> dq;
       for(int i =0;i<count;i++){
           TreeNode* n = q.front();
           levelnodes.push_back(n->val);
           q.pop_front();
           if(reverse)
           {
               if(n->left){dq.push_front(n->left);}
               if(n->right){dq.push_front(n->right);}
           }
           else{
                if(n->right){dq.push_front(n->right);}
               if(n->left){dq.push_front(n->left);}
           }
       }     
            q.insert(q.end(),dq.begin(),dq.end());
            result.push_back(levelnodes);
            reverse = !reverse;
        }
        return result;
    }
};
