class Pair{
    int first;
    int second;
    Pair(int _first, int _second)
    {
        this.first = _first;
        this.second = _second;
    }
}

class Tuple{
    int first;
    int second;
    int third;
    Tuple(int _first, int _second, int _third)
    {
        this.first = _first;
        this.second= _second;
        this.third = _third;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for(int i=0; i<m ; i++)
        {
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        int [] dist = new int[n];
        for(int i=0; i<n; i++)
        {
            dist[i] = (int)(1e9);
        }
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0,src,0));
        dist[src] =0;

        while(!q.isEmpty())
        {
            Tuple t = q.peek();
            q.remove();
            int stops = t.first;
            int node = t.second;
            int cost = t.third;

            if(stops > k) continue;
            for(Pair p : adj.get(node))
            {
                int adjNode = p.first;
                int givenCost = p.second;

                if(cost+givenCost< dist[adjNode] && stops <= k)
                {
                    dist[adjNode] = cost+givenCost;
                    q.add(new Tuple(stops+1, adjNode, cost+givenCost)); 
                }
            }
        }
        if(dist[dst] == (int)(1e9))
            return -1;
        return dist[dst];
    }
}
