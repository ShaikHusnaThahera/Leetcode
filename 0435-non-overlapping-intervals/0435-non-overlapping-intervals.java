class Solution {
    class Data{
        int s;
        int e;
        Data(int s,int e){
            this.s=s;
            this.e=e;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Data d[]=new Data[n];
        for(int i=0;i<n;i++){
            d[i]=new Data(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(d,(a,b)-> Integer.compare(a.e,b.e));
        int count=1;
        int endingtime=d[0].e;
        for(int i=1;i<n;i++){
            if(d[i].s >= endingtime){
                count++;
                endingtime=d[i].e;
            }
        }
        return n-count;
    }
}