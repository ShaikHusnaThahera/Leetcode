class Solution {
     boolean isZero(int n){
           while(n>0){
            if(n%10 == 0)
                return false;
                n=n/10;
           }
           return true;
        }
    public int[] getNoZeroIntegers(int n) {
        int ind=0;
        int a=1,b=1;
             List<Integer> hr=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            a=i;
            b=n-i;
            if(isZero(a)&&isZero(b)){
             hr.add(a);
             hr.add(b);
              return new int[] {a,b};
            }
        }
            return new int[] {1, n - 1};
    }
}