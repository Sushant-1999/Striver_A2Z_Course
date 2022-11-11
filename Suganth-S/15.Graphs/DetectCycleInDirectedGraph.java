class DetectCycleInDirectedGraph {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int preVis[] = new int [V];
        
        for(int i=0; i<V; i++)
        {
            if(vis[i]== 0)
            {
                if(dfsCheck(i, adj, vis, preVis) == true)
                    return true;
            }
        }
        return false;
    }
    
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj,
        int vis[], int preVis[])
    {
        vis[node] = 1;
        preVis[node]= 1;
        
        for(int it : adj.get(node))
        {
            if(vis[it] == 0)
            {
                if(dfsCheck(it,adj,vis,preVis) == true)
                {
                    return true;
                }
            }
            
            else if(preVis[it] == 1)
            {
                return true;
            }
        }
        preVis[node] = 0;
        return false;
    }
}
