package Java;

public class BubbleSort {

    public static int[] bubbleSort(int arr[]){
        int temp;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
           }
        }
        for(int i=0;i<n;i++)
           System.out.println("val "+arr[i]);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        bubbleSort(arr);
    }
}
