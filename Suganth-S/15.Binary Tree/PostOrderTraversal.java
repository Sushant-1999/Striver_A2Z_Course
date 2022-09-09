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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode top = st.peek();
            list.add(top.val);
            st.pop();
            if(top.right!=null)
            {
                st.push(top.right);
            }
            if(top.left!=null)
            {
                st.push(top.left);
            }
        }
        return list;
    }
}
