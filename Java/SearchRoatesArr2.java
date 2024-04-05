package Java;

public class SearchRoatesArr2 {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low,mid,high;
        low = 0;
        high = n-1;
        System.out.println("nums "+nums[10]);
        while(low<=high){
            System.out.println("low "+low+" "+high);
            mid = (low+high)/2;
            System.out.println("mid "+mid);
            System.out.println("good "+nums[low]+" "+nums[high]+" "+nums[mid]);
            if(nums[mid]==target)
               return true;
            else if(nums[low] == nums[mid] && nums[mid]== nums[high]){
                  System.out.println("here ok");
                  low = low + 1;
                  high = high - 1;
            } else if (nums[high] >= nums[mid]){
                System.out.println("here ok 2");
                if(target>nums[mid] && target<=nums[high])
                   low = mid + 1;
                else
                   high = mid - 1;   
            }  else if(nums[low] <= nums[mid]){
                System.out.println("here ok 3");
                if(target<nums[mid] && target>=nums[low])
                   high = mid - 1; 
                else
                    low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        SearchRoatesArr2 ob = new SearchRoatesArr2();
        System.out.println("ok "+ob.search(arr,13));
    }
}
