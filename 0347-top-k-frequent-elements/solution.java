class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums) map.put(ele,map.getOrDefault(ele,0)+1);
        int[] arr = new int[k];
        int freq=0,ans=0;
        for(int i=0;i<k;i++){
            freq=0;
        for(int key:map.keySet()){
            if(map.get(key)>freq){
                freq=map.get(key);
                ans=key;
            }
        }
        arr[i]=ans;
        map.remove(ans);
        }
        return arr;
    }
}
