class Solution {
    public static int reverse(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        return sum;
    } 
    public boolean isSameAfterReversals(int num) {
      int temp=num;
      int rev1=reverse(num);
      int rev2=reverse(rev1);
      if(temp==rev2){
        return true;
      }
      return false;
        // if(num == 0){
        //     return true;
        // }
        // else if(num%10 == 0){
        //     return false;
        // }
        // else{
        //     return true;
        // }
    }
}