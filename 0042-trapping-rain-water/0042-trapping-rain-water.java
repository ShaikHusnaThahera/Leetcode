class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxwater=0;
        int lmh[]=new int[n];
        int rmh[]=new int[n];
        lmh[0]=height[0];
        for(int i=1;i<n;i++){
            lmh[i]=Math.max(lmh[i-1],height[i]);
    }
    rmh[n-1]=height[n-1];
    for(int j=n-2; j>=0; j--){
            rmh[j] = Math.max(rmh[j+1], height[j]);
        }
        //now find the water trapped 
        for(int k=0; k<n; k++){
            int water = Math.min(lmh[k],rmh[k])-height[k];
            if(water>0) maxwater += water;
        }
        return maxwater;
    
    }
}