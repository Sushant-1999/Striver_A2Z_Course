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
    vector<int> rightSideView(TreeNode* root) {
        //Here for right Side View we are basically using Recursive PreOrder Travesla 
        // for better time complexity.
        vector<int> ans;
        rightView(root, 0, ans);
        return ans;
    }
    
    void rightView(TreeNode* root, int level, vector<int>& ans) {
        if(root == NULL) return;
        if(level == ans.size()) ans.push_back(root->val);
        //Right and left traverse
        rightView(root->right, level+1, ans);
        rightView(root->left, level+1, ans);
    }
};