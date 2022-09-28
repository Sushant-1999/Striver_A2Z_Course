class Solution {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p)
	{
		TreeNode succ = null;
		while(root!=null)
		{
		if(p.val>=root.val)
		{
			root= root.right;
		}
		else{
			succ = root;
			root = root.left;
		}
		return succ;
	}
}
