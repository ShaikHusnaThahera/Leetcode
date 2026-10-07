class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        boolean v=false;
        boolean c=false;
        if(n<3){
            return false;
        }
        else{
            for(int i=0;i<n;i++){
                char ch=word.charAt(i);
                if(ch>='0'&& ch<='9'){
                 continue;
                }
                else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ||  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    v=true;
                }
                else{
                    c=true;
                }
                }
                else{
                    return false;
                }
            }
        }
        return v&&c;
    }
}