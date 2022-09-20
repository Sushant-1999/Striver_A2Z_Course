//Binary Tree Representation in C++;

#include <bits/stdc++.h>
using namespace std;


struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;

    TreeNode(int val) {
        data = val;
        left = right = NULL;
    }
};

int main() {
    struct TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->right = new TreeNode(4);
    return 0;
}