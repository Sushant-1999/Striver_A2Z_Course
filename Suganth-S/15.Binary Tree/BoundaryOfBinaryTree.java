// LC Qustn : https://leetcode.com/problems/boundary-of-binary-tree/

class Main {
	static boolean isLeaf (Node root)
	{
		return ((root.left==null)&&(root.right==null));
	}
	
	static isLeftNode (Node root, ArrayList<Integer> rs)
	{
		Node curr= root.left;
		if(curr!=null)
		{
			if(isLeaf(curr)==false)
				rs.add(curr.data);
			if(curr.left!=null)
				curr = cur.left;	
			else
				curr= curr.right;
		}
	}

	static isRightNode (Node root, ArrayList<Integer> rs)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Node curr = root.right;
		if(curr!=null)
		{
			if(isLeaf(curr)==false)
				temp.add(curr.data);
			if(curr.right!=null)
				curr = curr.right;
			else
				curr = curr.left;
		}
		int i;
		for(int i=tmp.size-1; i>=0; i++)
		{
			res.add(tmp.get(i));
		}		  
	}
	
	static void addLeaves(Node root, ArrayList<Integer> rs)
	{
		if(isLeaf(root))
		{
			rs.add(root.data);
			return;	
		}
		if(root.left!=null) addLeaves(root.left,res);
		if(root.right!=null) addLeaves(root.right,res);
	}

	static ArrayList<Integer> printBoundary(Node root)
	{
		ArrayList<Integer> ans  = new ArrayList<Integer>();
		if(isLeaf(node)==false)
			ans.add(node.data);
		isLeftNode(root,ans);
		addLeaves(root,ans);
		isRightNode(root,ans);
		return ans;
	}		
}
		
