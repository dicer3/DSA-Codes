
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low,mid,high;
        low=0;
        high=n-1;
        while(low<=high){

            if(low == high)
               return nums[low];
            mid=(low+high)/2;
            System.out.println("nice "+mid+" "+low+" "+high);
            if(nums[low]!=nums[mid] && nums[mid]!=nums[high])
                 return nums[mid];   
            else if(nums[low] == nums[mid]){
                if(mid%2!=0)
                   low=mid+1;
                else 
                   high=mid-1;   
            } else if(nums[mid] == nums[high]){
                  if(mid%2!=0)
                    high=mid+1;
                  else
                    low=mid+1; 
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}