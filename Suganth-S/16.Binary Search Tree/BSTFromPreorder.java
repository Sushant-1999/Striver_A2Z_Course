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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    
    static TreeNode bstPreorder(int[] arr, int bound, int i[])
    {
        if(i[0] == arr.length || arr[i[0]]>bound)
            return null;
        TreeNode root = new TreeNode(arr[i[0]++]);
        root.left = bstPreorder(arr, root.val, i);
        root.right = bstPreorder(arr, bound, i);
        
        return root;
    }
}
