
    const findKRotation=(arr,n) => {
        // code here 
        
        let low,mid,high,minNo,index
        low = 0
        high = n-1
        minNo = Number.MAX_VALUE;
        while(low<=high){
            mid = (low+high)/2;
            console.log("low ",low," ",mid," ",high)
            if(arr[low]<=arr[high]){
                if(arr[low]<minNo){
                    minNo = arr[low];
                    index = low
                }
                return midNo
            } else if(arr[low]<=arr[mid]){
                if(arr[low]<minNo){
                    minNo = arr[low];
                    index = low
                }
                low=mid+1;
            } else if(arr[high]>=arr[mid]){
                if(arr[mid]<minNo){
                    minNo = arr[mid];
                    index = mid
                }
                high = mid-1;
            }
        }
    }

    findKRotation([5,1,2,3,4],5)