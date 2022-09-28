class Solution {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p)
	{
		TreeNode predecessor = null;
		while(root!=null)
		{
		if(root.val>=p.val)
		{
			root= root.left;
		}
		else{
			predecessor = root;
			root = root.right;
		}
		return predecessor;
	}
}
