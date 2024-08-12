class Solution {
    public void setZeroes(int[][] matrix) {
        
        HashSet<Integer> rows= new HashSet<Integer>();
        HashSet<Integer> cols= new HashSet<Integer>();

        int row= matrix.length;
        int col=matrix[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

       for(int i=0;i<row;i++)
       {
            for(int j=0;j<col;j++)
            {
                if(rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }

    }
}