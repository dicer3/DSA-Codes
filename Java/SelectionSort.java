package Java;

public class SelectionSort {
        public static int[] selectionSort(int arr[]){
            int temp;
            int n = arr.length;
            int minindex;
            for(int i=0;i<n-1;i++){
               minindex = i; 
               for(int j=i+1;j<n;j++){
                  if(arr[j]<arr[minindex]){
                       minindex = j;
                  }
               }
               temp = arr[minindex];
               arr[minindex] = arr[i];
               arr[i] = temp;
            }
            for(int i=0;i<n;i++)
               System.out.println("val "+arr[i]);
            return arr;
        }
        public static void main(String[] args) {
            int arr[] = {7,8,3,1,2};
            
            selectionSort(arr);
        }
}
