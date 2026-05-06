class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length()&&s.charAt(i)==s.charAt(j)) j++;
            int len=j-i;
            ans.append(len);
            ans.append(s.charAt(i));
            i=j;

        }return ans.toString();
    }
}
