/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    const n = nums.length;
    let low,mid,high;
    let minNo = Number.MAX_SAFE_INTEGER;
    low = 0;
    high = n - 1;
    while(low<=high){
       mid = parseInt((low+high)/2);
       console.log("mid "+mid," ",low," ",high)
       if(nums[low]<=nums[high]){
         console.log("ok 2",nums[low])
         console.log("minNo befroe "+minNo)
         minNo = Math.min(nums[low],minNo);
         console.log("minNo "+minNo)
         return minNo;
       }
       else if(nums[low]<=nums[mid]){
        console.log("secnd cond")
        // if(nums[low]<minNo){
        //   minNo = nums[low];
        // }
        minNo = Math.min(nums[low], minNo);
        low=mid+1;
       } else if(nums[high]>=nums[mid]){
        console.log("thrd cond")
        // if(nums[mid]<minNo){
        //   minNo = nums[mid];
        // }
        minNo = Math.min(nums[low], minNo);
        high = mid-1;
       }
    }
    return minNo;
};

console.log("nice "+findMin([3,1,2]));