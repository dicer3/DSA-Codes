
import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        System.out.println("niice "+n+" "+m);
        int i,j;
        i=n-1;
        j=0;
        
        while(i>=0 && j<m && arr1[i]>arr2[j]){
            System.out.println("niice "+i+" "+j);
            long temp;
            temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
            System.out.println("niice ***"+i+" "+j);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = new long[]{12 ,42};
        long[] arr2 = new long[]{3 ,4 ,5, 28, 37, 42, 43, 46};
        merge(arr1,arr2,2,8);
    }
}
