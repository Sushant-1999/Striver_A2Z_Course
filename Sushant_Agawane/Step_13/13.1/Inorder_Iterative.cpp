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
    vector<int> inorderTraversal(TreeNode* root) {
        //Here we will solve this using stack iterative solution.
        vector<int> ans;
        stack<TreeNode*> st;
        //if(root == NULL) return ans;
        TreeNode* node = root;
        
        //now we will keep adding left nodes till NULL
        // when we get null we will pop and store its values and then traverse to the right nodes.
        //when stack becomes Empty() we have to break and return the answer.
        while(true) {
            if(node != NULL) {
                st.push(node);
                node = node->left;
            }else {
                if(st.empty()) {
                    break;
                }
                node = st.top();
                st.pop();
                ans.push_back(node->val);
                node = node->right;
            }
        }
        return ans;
    }
};