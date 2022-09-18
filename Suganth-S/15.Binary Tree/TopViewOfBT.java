class Pair{
	Node node;
	int hd;
	Pair (Node _node, int _hd)
	{
	node = this._node;
	hd = this._hd;
	}
}

class TopViewOfBT(Node root)
{
	staic ArrayList<Integer> topView(Node root)
	{
	ArrayList<Integer> ans  = new ArrayList<>();
	if(root==null) return ans;
	Map<Integer, Node> tmap = new TreeMap<Integer, Node>();
	Queue<Node> queue = new LinkedList<>();
	queue.add(new Pair(root,0));
	while(!queue.isEmpty())
	{
		Pair it = queue.remove();
		Node curr = it.node;
		int line = it.hd;
		if(tmap.get(hd) == null)
			tmap.put(line,curr.val);
		if(curr.left!=null)
			q.add(new Pair(curr.left,line-1));
		if(curr.right!=null)
			q.add(new Pair(curr.right,line+1));
	}
	
	for(Map.Entry<Integer,Integer> entry: tmap.entrySet())
	{
		ans.add(entry.getValue());
	}
	}
	return ans;
}
