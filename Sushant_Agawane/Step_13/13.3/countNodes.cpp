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
    int countNodes(TreeNode* root) {
        //Here we are solving this problem by using the concept of count of nodes in full binary tree i.e. (2 ^n - 1).
        // we will search full binary trees in given binary tree to avoid extra node traversals which will give better time complexity for large number of trees.
        // For every sub-tree it will count the number of nodes using that formula
        if(root == NULL) return 0;
        int lh = findLeftHeight(root);
        int rh = findRightHeight(root);
        
        if(lh == rh) return (1 << lh) - 1;
        
        return 1 + countNodes(root->left) + countNodes(root->right);
    }
    
    int findLeftHeight(TreeNode* root) {
        int height = 0;
        while(root) {
            height++;
            root = root->left;
        }
        return height;
    }
    
    int findRightHeight(TreeNode* root) {
        int height = 0;
        while(root) {
            height++;
            root = root->right;
        }
        return height;
    }
};