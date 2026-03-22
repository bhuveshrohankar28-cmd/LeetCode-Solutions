class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        if(n<2) return true;
        int minOdd=Integer.MAX_VALUE;
        int minEven=Integer.MIN_VALUE;
        int oddCount=0;
        int evenCount=0;
        for(int x:nums1){
            if(x%2==0){
                evenCount++;
                minEven=Math.min(minEven,x);
            }else {oddCount++;
                   minOdd=Math.min(minOdd,x);}
        }boolean itsEven=true;
        for(int x:nums1){
            if(x%2!=0){
                if(minOdd==Integer.MAX_VALUE||x<=minOdd){
                    itsEven=false;
                    break;
                }
            }
        }boolean itsOdd=true;
        for(int x:nums1){
            if(x%2==0){
                if(minOdd==Integer.MAX_VALUE||x<=minOdd){
                    itsOdd=false;
                    break;
                }
            }
        }return itsOdd||itsEven;
    }
}
