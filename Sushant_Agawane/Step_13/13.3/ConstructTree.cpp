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
     
    void createMapping(vector<int>& inorder, map<int,int>& nodeToIndex, int size) {
        for(int i = 0; i < size; i++) {
            nodeToIndex[inorder[i]]=i;
        }
    }
    
     TreeNode* build(vector<int>& inorder, vector<int>& preorder, int &index, int inOrderStart, int inOrderEnd, int n, map<int,int>& nodeToIndex) {
        //base case;
        if(index >= n || inOrderStart > inOrderEnd) return NULL;
        //take the root node
        int element = preorder[index++];
        //take the root node
        TreeNode* root = new TreeNode(element);
        //now find the position of this root node in subtree from inorder tree.
        int position = nodeToIndex[element];
        //Now recursive calls for left subtree and right subtrees
        root->left = build(inorder, preorder, index, inOrderStart, position-1, n, nodeToIndex);
        root->right = build(inorder, preorder, index, position+1, inOrderEnd, n, nodeToIndex);
        return root;   
    }
    
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        // This is index of initial root
        int preOrderIndex = 0;
        int n = inorder.size();
        //create map to store 
        map<int, int> nodeToIndex;
        createMapping(inorder, nodeToIndex, n);
        TreeNode* ans = build(inorder, preorder, preOrderIndex, 0, n-1, n, nodeToIndex);
        return ans;
    }
};