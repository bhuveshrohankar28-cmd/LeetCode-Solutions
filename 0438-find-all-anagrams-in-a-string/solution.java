class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();
        List<Integer> list= new  ArrayList<>();
        int[] pArr = new int[26];
        int[] sArr = new int[26];
        for(int i=0;i<p.length();i++){
            pArr[p.charAt(i)-'a']++;//fixed
            sArr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pArr,sArr)) list.add(0);

        for(int i=p.length();i<s.length();i++){
            sArr[s.charAt(i-p.length())-'a']--;
            sArr[s.charAt(i)-'a']++;
            if(Arrays.equals(pArr,sArr)) list.add(i-p.length()+1);
        }
        return list;
    }
}
