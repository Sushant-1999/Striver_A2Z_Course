class BipartiteGraph {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0; i<graph.length; i++)
        {
            if(color[i] == -1)
            {
                color[i] = 0;
                if(!dfs(i,color,graph))
                    return false;
            }
        }
        return true;
    }

    public boolean dfs(int node, int color[], int[][]graph)
    {
        for(int nei: graph[node])
        {
            if(color[nei] == color[node])
            {
                return false;
            }
            if(color[nei]==-1)
            {
                color[nei] = 1-color[node];
                if(!dfs(nei,color,graph))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
