class Solution {
     public static boolean fun(String ans){
         HashSet<Character> hr=new HashSet<>(); 
        for(int i=0;i<ans.length();i++){
            char temp=(ans.charAt(i));
            hr.add((temp));
        }
        return (hr.size()==ans.length());
     }
    public int countGoodSubstrings(String s) {
      int n=s.length();
      int sl=3;
      String temp=" ";
      int gc=0;
      for(int i=0;i<=n-sl;i++){
             temp=(s.substring(i,i+sl));
                if(fun(temp)){
                    gc++;
                }
      }
      return gc;
    }
}