class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1,high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==num) return true;
            if(mid>num/mid) high=mid-1;
            else low=mid+1;
        }return false;
    }
}
