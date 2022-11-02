class DetectCycleInUGUsingDFS {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++)
        {
            if(vis[i] == false)
            {
                if(checkCycleDFS(i, -1, vis, adj)==true)
                    return true;
            }
        }
        return false;
    }
    
    public boolean checkCycleDFS(int src, int parent, boolean vis[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[src] = true;
        for(int adjNode : adj.get(src))
        {
            if(vis[adjNode] == false)
            {
                if(checkCycleDFS(adjNode, src, vis, adj) == true)
                    return true;
            }
            else if(adjNode!=parent)
                return true;
        }
        return false;
    }
}
