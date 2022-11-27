//User function Template for Java
class Pair
{
    int distance;
    int node;
    Pair(int _distance, int _node)
    {
        this.distance = _distance;
        this.node = _node;
    }
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<Pair> pq= new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        int[] distance = new int[V];
        for(int i=0; i<V; i++)
        {
            distance[i] = (int)1e9;
        }
        
        distance[S] = 0;
        pq.add(new Pair(0,S));
        
        while(pq.size()!=0)
        {
            int dis= pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            for(int i=0; i<adj.get(node).size(); i++)
            {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if(dis+edgeWeight < distance[adjNode])
                {
                 distance[adjNode] = dis+edgeWeight;
                 pq.add(new Pair(distance[adjNode],adjNode));
                }
            }
        }
        return distance;
    }
}

