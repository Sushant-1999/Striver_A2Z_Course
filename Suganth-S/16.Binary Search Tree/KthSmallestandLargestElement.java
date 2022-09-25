class Solution{
	int result = Integer.MIN_VALUE;
	private static int count = 0;
	int arr[] = {1,2,3,4,5,6,7};
	int k = 3;
	int i=0;
	TreeNode root=null;
	
	for(int i=0; i<arr.length; i++)
	{
		root= insertBst(root, arr[i]);
	}  
	int count=k;
	TreeNode large = kthLargest(root);
	TreeNode small = kthSmallest(root);
	if(small == null)
	{
		s.o.p("Invalid input");
	}
	else
	{
		s.o.p(small.val);
	}
	if(large == null)
	{
		s.o.p("Invalid input");
	}
	else
	{
		s.o.p(large.val);
	}

	static TreeNode insertBst(TreeNode root, int val)
	{
		if(root==null)
			return null; 
		if(val < root.data)
			root.left = insertBst( root.left, val);
		else
			root.right = insertBst( root.right, val);
		return root;
	}		

	static TreeNode kthLargest(TreeNode root)
	{
		 traverseLarge(root);
	        return result;
	}

	public void traverseLarge(TreeNode root) {
		if(root=null)
			return null;
		kthLargest(root.right);
		count--;
		
		if(count == 0)
			return root;
		kthLargest(root.left);
	}
	
	static TreeNode kthSmallest(TreeNode root)
	{
		traverseSmall(root);
	        return result;
	}	
	
	public void traverseSmall(TreeNode root) {
		if(root==null)
			return null;
		kthSmallest(root.left);
		count--;
		
		if(count==0)
			return root;
		kthSmallest(root.right);
	}
}

class TreeNode{
	TreeNode data;
	TreeNode left,right;
	TreeNode(int val)
	{
	  data = val;
	  left = null;
	  right = null;
	}
}
