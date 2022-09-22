/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) {
        //So here we will calculate the Height of the tree using recursion rather than using level order traversal due to better time complexity.
        if(root == NULL) return 0;
        int lt = maxDepth(root->left);
        int rt = maxDepth(root->right);
        
        return 1 + max(lt, rt);
    }
};