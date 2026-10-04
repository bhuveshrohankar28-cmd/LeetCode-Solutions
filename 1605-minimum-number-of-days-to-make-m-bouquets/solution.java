class Solution {
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k>arr.length) return -1;
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        int ans=max;
        int low =min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0,numBq=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=mid) count++;
                else{
                    numBq+=count/k;
                    count=0;
                } 
            } 
            numBq+=count/k;
            if(numBq>=m){ 
                ans=Math.min(mid,ans);
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
