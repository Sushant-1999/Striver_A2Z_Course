class Pair{
    int first;
    int second;
    int third;
    Pair(int _first, int _second, int _third)
    {
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        if(source[0]==destination[0] && source[1]==destination[1])
        {
            return 0;
        }
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] dist= new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dist[i][j] = (int)(1e9);
            }
        }
        dist[source[0]][source[1]] = 0;
        queue.add(new Pair(0, source[0], source[1]));
        int dr[] = {-1,0,1,0};
        int dc[] = {0,1,0,-1};
        
        while(!queue.isEmpty())
        {
            Pair p = queue.peek();
            queue.remove();
            int dis = p.first;
            int r = p.second;
            int c = p.third;
            
            for(int i=0; i<4; i++)
            {
                int newr= r+dr[i];
                int newc = c+dc[i];
                
                if(newr>=0 && newr < n && newc>=0 && newc<m 
                    && grid[newr][newc]== 1 
                    && dis+1 < dist[newr][newc])
                    {
                        dist[newr][newc]=1+dis;
                        if(newr == destination[0] && newc == destination[1])
                        {
                            return dis+1;
                        }
                        queue.add(new Pair(1+dis, newr, newc));
                    }
            }
        }
        return -1;
    }
}
