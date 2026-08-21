class Solution {
    public int[][] generateMatrix(int n) {
       int matrix[][]=new int[n][n];
    //  ArrayList<Integer> hr = new ArrayList<>();
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;
        int num=1;
        while (startrow <= endrow && startcol <= endcol) {
            // Right dir
            for (int i =startcol; i <= endcol; i++) {
               matrix[startrow][i]=num;
               num++;
            }
            // Down dir
            for (int j = startrow + 1; j <= endrow; j++) {
                matrix[j][endcol]=num;
                num++;
            }
            // Left dir
            if (startrow < endrow) {
                for (int k = endcol - 1; k >= startcol; k--) {
                    matrix[endrow][k]=num;
                    num++;
                }
            }
            // Up dir
            if (startcol < endcol) {
                for (int l = endrow - 1; l >= startrow + 1; l--) {
                    matrix[l][startcol]=num;
                    num++;
                }
            }
            
            startcol++;
            startrow++;
            endcol--;
            endrow--; 
        }
        // matrix[n/2][n/2]=num;
        return matrix;
    }
}