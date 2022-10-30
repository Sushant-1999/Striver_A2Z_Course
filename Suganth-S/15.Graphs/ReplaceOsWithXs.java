
class ReplaceOsWithXs{
    static char[][] fill(int n, int m, char a[][])
    {
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        int vis[][] = new int [n][m];
        
        for(int i=0; i<m; i++)
        {
            if(vis[0][i]==0 && a[0][i]=='O')
            {
                dfs(0,i,vis,a,delRow,delCol);
            }
            
            if(vis[n-1][i]==0 && a[n-1][i]=='O')
            {
                dfs(n-1, i , vis, a, delRow, delCol);
            }
        }
        
        for(int j=0; j<n; j++)
        {
            if(vis[j][0]==0 && a[j][0]=='O')
            {
                dfs(j,0,vis,a,delRow,delCol);
            }
            
            if(vis[j][m-1]==0 && a[j][m-1]=='O')
            {
                dfs(j, m-1 , vis, a, delRow, delCol);
            }
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(vis[i][j]==0 && a[i][j]=='O')
                {
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
    
    public static void dfs(int row, int col, int vis[][], char mat[][], int delRow[], int delCol[])
    {
        vis[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0; i<4; i++)
        {
            int nRow = row+delRow[i];
            int nCol = col+delCol[i];
            
            if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==0 && mat[nRow][nCol]=='O')
            {
                dfs(nRow, nCol, vis, mat, delRow, delCol);
            }
        }
    }
}
