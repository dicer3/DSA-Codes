package Java;

public class MergeSort {
     static void merge(int arr[],int l,int mid,int r){
        System.out.println("merge fn");
        int n1 = mid - l + 1;
        int n2 = r - mid;
        System.out.println("n2 "+l+" "+r+" "+mid+" "+n2+" "+n1);
        int left[] = new int[n1];
        int right[] = new int[n2];

        int k = 0;
        for(int i=l;i<=mid;i++)
           left[k++] = arr[i];
        k = 0;   
        for(int i=mid+1;i<=r;i++)   
            right[k++] = arr[i];
        
        for(int i=0;i<n1;i++)
           System.out.print(left[i]+" ");
        
        System.out.println();
        for(int j=0;j<n2;j++)
           System.out.print(right[j]+" ");
        System.out.println();
        int i,j;
        i = j = 0;
        k = l;
        
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i]; 
                k++;
                i++;
            } else {
                arr[k] = right[j]; 
                k++;
                j++;
            }
        }
        System.out.println("i "+i+" "+j);

        while(i<n1){
            arr[k] = left[i]; 
            k++;
            i++;
        }

        while(j<n2){
            arr[k] = right[j]; 
            k++;
            j++;
        }

        for(int z=l;z<=r;z++)
           System.out.print(arr[z]+" ");
        System.out.println();   

     }
     static void mergeSort(int arr[],int l, int r){
        if(l==r)
           return;
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6, 7,8};
        mergeSort(arr, 0, arr.length - 1);
        // System.out.println("new arr");

        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
}
