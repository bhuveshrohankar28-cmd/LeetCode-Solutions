class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int i=0;
        if(n%2!=0) arr[i++]=0;
        for(int idx=1;idx<=n/2;idx++){
            arr[i++]=idx;
            arr[i++]=-idx;
        }return arr;
    }
}
