class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        int sor[]=nums.clone();
        Arrays.sort(sor);
        int ans=0;
        for(int k=1;k<=n;k++){
            if(n%k!=0){
                continue;
            }
            boolean val=true;
            for(int s=0;s<n;s+=k){
                int pat[]=Arrays.copyOfRange(sor,s,s+k);
                int lps[]=new int[k];
                int len=0;
                for(int i=1;i<k;){
                    if(pat[i]==pat[len]){
                        lps[i++]=++len;
                    }
                    else if(len>0){
                        len=lps[len-1];
                    }
                    else{
                        lps[i++]=0;
                    }
                }
                int j=0;
                for(int m=0;m<2*k-1;m++){
                    int v=nums[s+(m%k)];
                    while(j>0 && v!=pat[j]){
                        j=lps[j-1];
                    }
                    if(v==pat[j]){
                        j++;
                    }
                    if(j==k){
                        break;
                    }
                }
                if(j!=k){
                    val=false;
                    break;
                }
            }
                if(val){
                    ans+=k;
                }
            }
            return ans;
    }
}