package Java;

public class SingleEleSortedArr {
    public static int singleNonDuplicate(int[] nums) {
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
            else if(nums[mid] == nums[mid-1]){
                System.out.println("nice ok");
                if(mid%2!=0) {
                    System.out.println("for me");
                   low=mid+1;
                }   
                else {
                System.out.println("for new");
                   high=mid;
                }      
            } else if(nums[mid] == nums[mid+1]){
                  if(mid%2!=0)
                    high=mid-1;
                  else
                    low=mid; 
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
       System.out.println("nice "+singleNonDuplicate(arr));
    }
}
