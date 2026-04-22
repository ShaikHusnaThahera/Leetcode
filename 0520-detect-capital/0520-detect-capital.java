class Solution {
    public boolean detectCapitalUse(String word) {
        // int i=0;
        if(word.equals(word.toUpperCase())){
            return true;
        }
        else if(word.equals(word.toLowerCase())){
            return true;
        }
        else{
            boolean ans=true;
            char ch=word.charAt(0);
             if(!(ch>='A'&&ch<='Z')){
                    ans=false;
                }
            for(int i=1;i<word.length();i++){
               char c=word.charAt(i);
               if (!(c >= 'a' && c <= 'z')) {
                ans = false;
                break;
            }
            }
            return ans;
        }
        // return false;
    }
}