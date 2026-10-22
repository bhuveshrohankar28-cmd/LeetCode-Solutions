class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String A = strs[0];
        String B = strs[strs.length-1];
        for(int i=0;i<Math.min(A.length(),B.length());i++){
            if(A.charAt(i)==B.charAt(i)) sb.append(A.charAt(i));
            else break;
        }
        return sb.toString();
    }
}
