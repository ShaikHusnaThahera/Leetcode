class Solution {
    public static int fun(String a){
        int nums[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day=Integer.parseInt(a.substring(3));
        int mon=Integer.parseInt(a.substring(0,2));
        int total=0+day;
        for(int i=0;i<mon-1;i++){
            total+=nums[i];
        }
        // System.out.println(total);
        return total;      
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int alicefirstdate=fun(arriveAlice);
        int alicelastdate=fun(leaveAlice);
        int bobfirstdate=fun(arriveBob);
        int boblastdate=fun(leaveBob);
        int start = Math.max(alicefirstdate,bobfirstdate);
        int end = Math.min(alicelastdate,boblastdate);
        if(start>end){
            return 0;
        }
        return end-start+1;
    }
}