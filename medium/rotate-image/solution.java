class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i =0;i<matrix.length;i++){
            int si = 0;
            int ei = matrix.length-1;
            while(si<ei){
                int temp = matrix[i][si];
                matrix[i][si] = matrix[i][ei];
                matrix[i][ei] = temp; 
                si++;
                ei--;
            }
        }
    }
}