class Solution {
    public String makeGood(String s) {
        Stack<Character> hr=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(hr.isEmpty()){
                hr.push(s.charAt(i));
            } 
            else{
                if((char)(s.charAt(i)-32) == hr.peek() || (char)(s.charAt(i)+32) == hr.peek()){
                    hr.pop();
                }
                else{
                    hr.push(s.charAt(i));
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!hr.isEmpty()){
            ans.append(hr.pop());
        }
        return ans.reverse().toString();
    }
}