class Solution {

    public static int countNeighbours(int [][] t, int row, int col)
    {
        int n=0;
        for(int i=row-1; i<row+2; i++)
        {
            for(int j=col-1; j<col+2; j++)
            {
                if((i==row && j==col) || i<0 || j<0 || i==t.length || j==t[0].length)
                    continue;
                if(t[i][j]==1 || t[i][j]==3)
                    n++;
            }
        }
        return n;
    }

    public void gameOfLife(int[][] board) {
        
        // Original | New | State
        //    0     |  0  |   0
        //    1     |  0  |   1
        //    0     |  1  |   2
        //    1     |  1  |   3

        int row= board.length, col= board[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col;j++)
            {
                int n=countNeighbours(board,i,j);
                if(board[i][j]==0)
                {
                    if(n==3)
                        board[i][j]=2;
                }
                if(board[i][j]==1)
                {
                    if(n==2 || n==3)
                        board[i][j]=3;
                    else
                        board[i][j]=1;
                }
            }
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==1 || board[i][j]==0)
                    board[i][j]=0;
                else if(board[i][j]==2 || board[i][j]==3)
                    board[i][j]=1;
            }
        }        

    }
}