class Solution {
    public int largestAltitude(int[] gain) {
        int size=gain.length;
        int arr[]=new int[size+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=arr[0];
        for(int m:arr){
            if(m>max)
            max=m;
        }
        return max;
    }
}