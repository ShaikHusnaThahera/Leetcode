class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> hr=new ArrayList<>();
        int startrow=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        int startcol=0;
        while(startrow<= endrow && startcol<=endcol){
        //right dir
        for(int i=startcol;i<=endcol;i++){
            hr.add(matrix[startrow][i]);
        }
        //down dir
        for(int j=startrow+1;j<=endrow;j++){
            hr.add(matrix[j][endcol]);
        }
        //left dir
        if(startrow<endrow){
        for(int k=endcol-1;k>=startcol;k--){
            // if(endrow==startrow) break;
            hr.add(matrix[endrow][k]);
        }
        }
        //up dir
        if(startcol<endcol){
        for(int l=endrow-1;l>=startrow+1;l--){
            // if(endcol==startcol) break;
            hr.add(matrix[l][startcol]);
        }
        }
        startcol++;
        startrow++;
        endcol--;
        endrow--;
        }
        return hr;
    }
}