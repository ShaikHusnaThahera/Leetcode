class Solution {
            static int add(int num){
                 int n=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            n+=digit;
        }
        if(n>9){
           return add(n);
        }
        else{
            return n;
        }
        }
    public int addDigits(int num) {
   int result=add(num);
   return result;
    }
}