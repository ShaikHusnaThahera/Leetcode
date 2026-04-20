class Solution {
    public int maxDistance(int[] colors) {
int size=colors.length;
int lt=size-1;
int a=0;
for(int i=0;i<size;i++){
    if(colors[i]!=colors[size-1]){
      lt=i;
      break;
    }
}
for(int i=size-1;i>=0;i--){
    if(colors[i]!=colors[0]){
        a=i;
        break;
    }
}
int r=size-1-lt;
int l=a;
return Math.max(r,l);
    }
}