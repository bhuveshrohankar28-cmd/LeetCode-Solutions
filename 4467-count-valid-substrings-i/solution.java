class Solution {
    public long countValidSubstrings(String s) {
        long InvCount = 0;
        long n = s.length();
        long totalSubstring = n*(n+1)/2;
        long lastPos=-1;

        for(int i=2;i<s.length();i++){
            if(s.charAt(i-2)=='a' && s.charAt(i-1)=='b' && s.charAt(i)=='c'){
                lastPos=i-2;
            }
            if(lastPos!=-1){
                InvCount+=lastPos+1;
            }
        }

        
        return totalSubstring-InvCount;
    }
}
