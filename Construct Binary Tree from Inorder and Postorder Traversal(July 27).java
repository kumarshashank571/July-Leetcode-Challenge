class Solution {
public:
TreeNode *buildTree(vector<int> &postorder, int psi, int pei, vector<int> &inorder, int isi, int iei) // si=starting index, ei = end index.
{
    if (psi > pei)
        return nullptr;

    TreeNode *node = new TreeNode(postorder[pei]);

    int idx = isi;
    while (inorder[idx] != postorder[pei])
        idx++;

    int tel = idx - isi;

    node->left = buildTree(postorder, psi, psi + tel - 1, inorder, isi, idx - 1);
    node->right = buildTree(postorder, psi + tel, pei - 1, inorder, idx + 1, iei);

    return node;
}

TreeNode *buildTree(vector<int> &inorder, vector<int> &postorder)
{
    int n = inorder.size();
    return buildTree(postorder, 0, n - 1, inorder, 0, n - 1);
}
};
