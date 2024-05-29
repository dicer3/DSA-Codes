
public class QuickSort {

    static void swap(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int l,int r){
        int pidx = l;
        int pivot = arr[r];
        for(int j=l;j<=r;j++){
           if(arr[j]<pivot){
              swap(arr,pidx,j);
              pidx++;
           }
        }
        swap(arr,pidx,r);
        return pidx;
    }
    static void quickSort(int arr[],int l,int r){
        if(l<r){
           int pidx = partition(arr,l,r);
           quickSort(arr, l, pidx-1);
           quickSort(arr, pidx+1, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6, 7,8};
        quickSort(arr, 0, arr.length - 1);

        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
}
