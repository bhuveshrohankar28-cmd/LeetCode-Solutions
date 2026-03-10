class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        } 
    HashMap<Character,Integer> aMap=new HashMap<>();
    for (char ele : s.toCharArray()) {
        aMap.put(ele, aMap.getOrDefault(ele, 0) + 1);
    }
    for (char ele : t.toCharArray()) {
        if (!aMap.containsKey(ele)) {
            return false;
        }if(aMap.get(ele)==0) return false;
        aMap.put(ele, aMap.get(ele) - 1);
        // if (aMap.get(ele) < 0) {
        //     return false;
        // }
    }
    return true;
    }
}
