class DFS{
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<5; i++)
		{
			adjList.add(new ArrayList<Integer>());
		}
		
		adj.get(0).add(2);
		adj.get(2).add(0);
		adj.get(1).add(3);
		adj.get(3).add(1);
		adj.get(2).add(4);
		adj.get(4).add(2);
		adj.get(0).add(3);
		adj.get(3).add(0);
		
		DFS dfs = new DFS();
		ArrayList<Integer> ans = dfs.dfsOfGraph(5,adj);
		int n = ans.size();
		for(int i=0; i<n; i++)
		{
			ans.get(i);
		}
	}
	
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<Integer> adj)
	{
		boolean vis[] = new boolean[V+1];
		vis[0] = true;
		ArrayList<Integer> ls = new ArrayList<Integer>();
		dfs(0,vis,ls,adj);
		return ls;
	}
	
	public static void dfs(int node, boolean vis[], ArrayList<Integer> ls, ArrayList<Integer> adj)
	{
		vis[node]  = true;
		ls.add(node);
		
		for(Integer it : adj.get(node))
		{
			if(vis[it] == false)
			{
				dfs(it, vis, ls, adj);
			}
		}
	}
		
	
