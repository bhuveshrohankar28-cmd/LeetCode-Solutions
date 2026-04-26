class Solution {
    public char findTheDifference(String s, String t) {
        int ans=0;
        for(char ele:s.toCharArray()) ans=ans^ele;
        for(char ele:t.toCharArray()) ans=ans^ele;
        return (char)ans;
    }
}
