package Java;

public class MinEatingSpeed {
    public static int minEatingSpeed(int[] piles, int h) {
        int maxEle=-1;
        int n = piles.length;
        for(int i=0;i<n;i++){
            if(piles[i]>maxEle){
                maxEle = piles[i];
            }
        }

        int low,mid,high,minBan;
        minBan = Integer.MAX_VALUE;
        low=1;
        high=maxEle;
        while(low<=high){
            mid=(low+high)/2;
            System.out.println("nice and "+low+" "+mid+" "+high);
            int ans=0;
            for(int i=0;i<n;i++){
                System.out.println("nice "+Math.ceil((double)piles[i]/mid)+" "+(double)piles[i]/mid);
                ans += Math.ceil((double)piles[i]/mid);
            }
            System.out.println("ans is "+ans);
            if(ans <=h){
               minBan = Math.min(mid,minBan);
               System.out.println("minBan "+minBan);
               high = mid-1;
            } else {
                low = mid+1;
            }
              
        }
        return minBan;
    }

    public static void main(String[] args) {
        System.out.println("hi "+minEatingSpeed(new int[]{3,6,7,11},8));
    }

}
