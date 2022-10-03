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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return true;
        
        BSTIterator left = new BSTIterator(root,false);
        BSTIterator right= new BSTIterator(root,true);
        
        int i = left.next();
        int j = right.next();
        
        while(i<j)
        {
            if(i+j == k)
                return true;
            else if(i+j>k)
                j=right.next();
            else
                i=left.next();
        }
        return false;
    }
}

public class BSTIterator{
    public Stack<TreeNode> stack = new Stack<TreeNode>();
    boolean reverse = true;
    
    public BSTIterator(TreeNode root, boolean isReverse)
    {
        reverse= isReverse;
        pushAll(root);
    }
    
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    
    public int next(){
        TreeNode temp = stack.pop();
        if(reverse == false)
                pushAll(temp.right);
        else
            pushAll(temp.left);
        return temp.val;
    }
    
    public void pushAll(TreeNode node)
    {
        while(node!=null)
        {
            stack.push(node);
            if(reverse==true)
            {
                node = node.right;
            }else{
                node = node.left;
            }
        }
    }
}
