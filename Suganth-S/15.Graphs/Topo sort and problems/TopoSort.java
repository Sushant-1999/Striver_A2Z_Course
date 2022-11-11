/*Complete the function below*/


class TopoSort
{
    public static void dfs(int node, Stack<Integer>st, int vis[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[node] = 1;
        for(int it: adj.get(node)){
            if(vis[it]==0)
            {
                dfs(it,st, vis,adj);
            }
        }
        st.push(node);
    }
    
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int vis[] = new int [V];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i<V; i++)
        {
            if(vis[i]==0)
            {
                dfs(i, st, vis,adj);
            }
        }
        
        int ans[] = new int[V];
        int i=0;
        while(!st.isEmpty())
        {
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }
}
