class Solution {
    public int countGoodSubstrings(String s) {
      int ans=0;
     int sl=3;
     int l=0;
     HashMap<Character,Integer> hr=new HashMap<>();
      for(int r=0;r<s.length();r++){
          char ch=s.charAt(r);
          hr.put(ch,hr.getOrDefault(ch,0)+1);
          if(r-l==sl){
              char tch=s.charAt(l);
              hr.put(tch,hr.get(tch)-1);
              if(hr.get(tch)==0){
                  hr.remove(tch);
              }
              l++;
          }
          if(hr.size()==sl){
              ans=ans+1;
          }
    }
    return ans;
    }
}