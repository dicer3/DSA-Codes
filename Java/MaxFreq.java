
import java.util.Arrays;

public class MaxFreq {
    public static int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        int p1,p2;
        p1=p2=0;
        Arrays.sort(nums);
        int ans = 1;
        while(p2<n){
            int sum = 0;
            for(int i=p1;i<=p2;i++)
               sum += nums[i]; 
             System.out.println("sum "+sum);  
            int length = p2-p1+1;
            if(nums[p2]*length <= sum + k){
                System.out.println("p1 "+p2+" "+p1+" "+length);
                ans = length;
                p2++;
            } else {
                p1++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
      System.out.println("nice "+maxFrequency(new int[]{3,9,6},2)); 
    }
}
