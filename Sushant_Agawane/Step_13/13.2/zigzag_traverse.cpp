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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        //Here we are using level order traversal for getting zig zag of tree.
        vector<vector<int>> ans;
        bool flag;
        if(root == NULL) return ans;
        queue<TreeNode*> q;
        q.push(root);
        flag = true;
        while(!q.empty()) {
            int len = q.size();
            vector<int> res(len);
            
            for(int i = 0; i < len; i++) {
                TreeNode* node = q.front();
                q.pop();
                
                int pos = flag ? i : (len-1-i);
                res[pos] = node->val;
                
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
                
            }
            flag = !flag;
            ans.push_back(res);
        }
        return ans;
        
    }
};