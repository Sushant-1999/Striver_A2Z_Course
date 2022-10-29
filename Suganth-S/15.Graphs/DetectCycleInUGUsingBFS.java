//Prob : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

class DetectCycleInUGUsingBFS {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++)
        {
            vis[i] = false;
        }
        for(int i=0; i<V; i++)
        {
            if(vis[i] == false)
            {
                if(checkCycle(i, V, vis, adj))
                    return true;
            }
        }
        return false;
    }
    
    public boolean checkCycle(int src, int V, boolean vis[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        
        while(!q.isEmpty())
        {
            int currNode = q.peek().first;
            int parNode = q.peek().second;
            q.poll();
            
            for(int adjNode: adj.get(currNode))
            {
                if(vis[adjNode]== false)
                {
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode, currNode));
                }
                else if(parNode != adjNode)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    class Pair{
        int first;
        int second;
        
        Pair(int _src, int _num)
        {
            this.first = _src;
            this.second = _num;
        }
    }
}
