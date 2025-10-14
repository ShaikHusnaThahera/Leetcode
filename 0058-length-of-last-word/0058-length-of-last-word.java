class Solution {
    public int lengthOfLastWord(String s) {
        boolean seen=false;
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                if(seen){
                    break;
                }
                else{
                    continue;
                }
            }
            else{
                seen=true;
                count++;
            }
        }
        return count;
    }
}