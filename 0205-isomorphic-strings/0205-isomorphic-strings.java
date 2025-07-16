class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> hr=new HashMap<>();
       HashMap<Character,Character> boom=new HashMap<>();
       boolean ans=true;
       for(int i=0;i<s.length();i++){
           char n=s.charAt(i);
           char m=t.charAt(i);
           if(!hr.containsKey(n) && !boom.containsKey(m)){
              hr.put(n,m);
              boom.put(m,n);
           }
           if(hr.containsKey(n)&& hr.get(n)!=m || boom.containsKey(m)&& boom.get(m)!=n   ){
               ans=false;
               break;
           }
       }
       return ans;
    }
}