class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> Map=new HashMap<>();
        for(int ele:nums){
            Map.put(ele,Map.getOrDefault(ele,0)+1);
        }for(int ele:nums){
            if(ele%2==0&&Map.get(ele)==1){
                return ele;
            }
        }return -1;
    }
}
