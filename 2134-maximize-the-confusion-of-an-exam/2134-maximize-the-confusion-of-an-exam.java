class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
         int zcount=0,ocount=0,ans=0,l1=0,l2=0,res=0;
     for(int r=0;r<answerKey.length();r++){
        if(answerKey.charAt(r)=='T'){
            zcount+=1;
        }
        while(zcount>k){
            if(answerKey.charAt(l1)=='T'){
                zcount--;
            }
            l1=l1+1;
        }
        ans=Math.max(ans,r-l1+1);
     }
     for(int r=0;r<answerKey.length();r++){
        if(answerKey.charAt(r)=='F'){
            ocount+=1;
        }
         while(ocount>k){
            if(answerKey.charAt(l2)=='F'){
                ocount--;
            }
            l2=l2+1;
        }
        res=Math.max(res,r-l2+1);
     }
     return Math.max(res,ans);
    }
}