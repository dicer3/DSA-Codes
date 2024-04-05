package Java;

public class FirstLastOccurance {

    public static int lowerBound(int[] arr, int target){
         
        int low = 0;
        int high = arr.length - 1;
        int mid,ans;
        ans = arr.length;
        while(low<high){
           mid = low + (high-low)/2;
           if(arr[mid]>=target){
              ans=mid;
              high = mid-1;
           } else {
             low = mid+1;
           }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int target){
         
        int low = 0;
        int high = arr.length - 1;
        int mid,ans;
        ans = arr.length;
        while(low<high){
           mid = low + (high-low)/2;
           if(arr[mid]>target){
              ans=mid;
              high = mid-1;
           } else {
             low = mid+1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[]={2,4,6,8,8,8,11,13};
        System.out.println("lower bound "+lowerBound(arr,8));
        System.out.println("upper bound "+upperBound(arr,8));

        int arr2[]={0 ,0 ,1 ,1 ,2 ,2 ,2 ,2};
        System.out.println("lower bound "+lowerBound(arr2,2));
    }
}