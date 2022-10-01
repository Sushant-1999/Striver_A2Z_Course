/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode first;
        private TreeNode middle;
        private TreeNode last;
        private TreeNode prev;
        
    public void recoverTree(TreeNode root) {
        first=middle=last=null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorderTree(root);
        
        if(first!=null && last!=null)
        {
            int t = first.val;
            first.val = last.val;
            last.val = t;
        }
        else if (first!=null && middle!=null)
        {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }
    
    public void inorderTree(TreeNode root)
    {
        if(root==null)
            return;
        
        inorderTree(root.left);
        
        if(prev!=null && (root.val < prev.val))
        {
            if(first==null)
            {
                first = prev;
                middle = root;
            }
            else
                last = root;    
        }
        prev = root;
        inorderTree(root.right);
    }
}
