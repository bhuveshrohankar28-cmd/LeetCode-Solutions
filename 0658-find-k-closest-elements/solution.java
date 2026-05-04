class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list =new ArrayList<>();
        int ruleOut=arr.length;
        int i=0,j=arr.length-1;
        while(ruleOut-->k){
            if((Math.abs(arr[i]-x))<=(Math.abs(arr[j]-x))){
                j--;
            }else i++;
        }for(int idx=i;idx<=j;idx++){
            list.add(arr[idx]);
        }return list;
    }
}
