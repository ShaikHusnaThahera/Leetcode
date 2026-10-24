import java.util.Scanner;
class Solution{
    public static int[] twoSum(int[] nums,int target){
    //      int i=0,j=0;
    //      for( i=0;i<nums.length;i++){
    //         for( j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //      }
    //       return  new int[]{};
    //      }
    // }
    // class Main{
    //     public static void main(String args[]){
    //         Scanner s=new Scanner(System.in);
    //         int target=s.nextInt();
    //         int nums[]=new int[100];
    //         for(int i=0;i<nums.length;i++){
    //              nums[i]=s.nextInt();
    //         }
    //         Solution.twoSum(nums,target);
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hr.containsKey(complement)){
                return new int[]{hr.get(complement),i};
            }
            hr.put(nums[i],i);
        }
        return new int[]{-1,-1};
        }
    }
