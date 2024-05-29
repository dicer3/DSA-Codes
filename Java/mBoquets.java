
public class mBoquets {

        static boolean checkPossible(int[] bloomDay, int m, int k, int n,int bloomVal){
           int c=0;
           int noBoque=0;
           System.out.println("for ans "+bloomVal);
           for(int i=0;i<n;i++){
                System.out.println("c "+c);
               if(bloomDay[i]<=bloomVal)
                  c++;
               else {
                   System.out.println("nice "+k+" "+c+" "+c/k);
                   noBoque+=c/k;
                   c=0;
                   System.out.println("noBoque "+noBoque);
               }  
           }
           noBoque = noBoque + c/k;
           System.out.println("no boque "+noBoque);
           if(noBoque>=m)
               return true;
           else 
               return false; 
       }
   
       public static int minDays(int[] bloomDay, int m, int k) {
           int n = bloomDay.length;
           if(m*k>n)
              return -1;
           int minEle,maxEle,low,mid,high,ans;
           minEle = Integer.MAX_VALUE;
           maxEle = -1;
           ans = -1;
           for(int i=0;i<n;i++){
               maxEle = Math.max(maxEle, bloomDay[i]);
               minEle = Math.min(minEle, bloomDay[i]);
           }
   
           System.out.println("hey "+maxEle+ " "+minEle);
           low=minEle;
           high=maxEle;
           while(low<=high){
               mid=(low+high)/2;
   
               if(checkPossible(bloomDay, m, k, n,mid)){
                   ans = mid;
                   high=mid-1;
               } else {
                   low = mid+1;
               }
   
           } 
           return ans;
       }
       public static void main(String[] args) {
        System.out.println("nice "+minDays(new int []{1,10,3,10,2}, 3, 1));
       }
}
