class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list =new ArrayList<>();
        int n=arr.length;
        int i=0,j=arr.length-1;
        int ruleOut=arr.length-k;
        while(ruleOut-->0){
            if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)) j--;
            else i++;
        }for(int idx=i;i<=j;i++){
            list.add(arr[i]);
        }return list;
    }
}
