/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
const swap=(nums,i,j)=>{
    let temp
    temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
 }
 var nextPermutation = function(nums) {
    console.log("fine ")
     let n = nums.length
     let idx = -1
     let minIndex = -1
     console.log("new ")
     for(let i=n-2;i>=0;i--){
        console.log("i "+i)
         if(nums[i]<nums[i+1]){
             idx = i;
             break;
         }
     }
     console.log("n ",n," ",idx)
     if(idx === -1){
         nums.reverse();
     } else {
        console.log("ok 2")
         for(let i=idx+1;i<n;i++){
             if(nums[i]>nums[idx]){
                 minIndex = i
             }
         }
         console.log("minIndex "+minIndex)
         swap(nums,idx,minIndex)
         console.log("nums ##",nums)
         nums = [...nums.slice(0,idx+1),...nums.slice(idx+1,n).sort()]
         console.log("nums ..",nums)
     }


 };

 nextPermutation([1,3,2])

