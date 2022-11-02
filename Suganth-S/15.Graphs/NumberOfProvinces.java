class DFS{
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		adj.add(new ArrayList<Integer>());
		adj.get(0).add(0,1);
		adj.get(0).add(1,0);
		adj.get(0).add(1,2);
		adj.add(new ArrayList<Integer>());
		adj.get(1).add(3,4);
		adj.get(1).add(4,3);
		adj.get(1).add(4,5);
		adj.add(new ArrayList<Integer>());
		adj.get(2).add(6,7);
		adj.get(2).add(7,6);
		
		DFS dfs = new DFS();
		Systemout.println(dfs.dfsOfGraph(3,adj));
	}
	
	public static void dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>(); 
        for(int i = 0;i<V;i++) {
            adjLs.add(new ArrayList<Integer>()); 
        }
		
		for(int i=0; i<V; i++)
		{
			for(int j=0; i<V; j++)
			{
				if(adj.get(i).get(j) == 1 && i!=j)
				{
					adjLs.get(i).add(j);
					adjLs.get(j).add(i);
				}
			}
		}

		int vis[] = new int[V];
		int cnt = 0;
		for(int i=0; i<V; i++)
		{
			if(vis[i]==0)
			{
				cnt++;
				dfs(i, adjLs, vis);
			}
		}	
	}
	
	public static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int vis[])
	{
		vis[node] = 1;
		for(Integer i : adj.get(node))
		{
			if(vis[i]==0)
			{
				dfs(i, adjLs, vis);
			}
		}
	}
}
		
	
