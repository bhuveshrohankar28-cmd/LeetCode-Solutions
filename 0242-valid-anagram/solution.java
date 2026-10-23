class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map =new HashMap<>();
        for(char ele:t.toCharArray()) map.put(ele,map.getOrDefault(ele,0)+1);
        for(char ch:s.toCharArray()) {
            if(!map.containsKey(ch)||map.get(ch)==0) return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}
