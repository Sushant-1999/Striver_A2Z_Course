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

//Iterative solution
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        
        LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
        ll.addLast(root);
        int height=0;
        while(ll.size() > 0)
        {
            int size = ll.size();
            
            while(size-- > 0)
            {
                TreeNode remNode = ll.removeFirst();
                if(remNode.left != null)
                {
                    ll.addLast(remNode.left);
                }
                if(remNode.right != null)
                {
                    ll.addLast(remNode.right);
                }
            }
            height++;
        }
        return height;
    }
}

//Recursive Solution

class Solution{
 public int maxDepth(TreeNode root) {
     if(root == null)
         return 0;
     
     return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
  }
}
