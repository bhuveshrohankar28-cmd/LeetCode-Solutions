class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int Missing=arr[mid]-mid-1;
            if(k<=Missing){
                high=mid-1;
            }else low=mid+1;
        }return low+k;//high+k+1;
    }
}
