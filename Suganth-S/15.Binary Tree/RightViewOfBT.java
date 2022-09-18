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
    
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        resultList(arr, root, 0);
        return arr;
    }
    
    static void resultList (List<Integer> res, TreeNode root, int currLevel)
    {
        if(root==null)
            return;
        
        if(currLevel == res.size())
        {
            res.add(root.val);
        }
        
        resultList(res, root.right, currLevel+1);
        resultList(res, root.left, currLevel+1);
    }
}
