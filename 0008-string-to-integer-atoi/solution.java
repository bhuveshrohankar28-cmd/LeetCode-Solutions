class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i = 0,sign=1;
        long res=0;
        if(s.length()==0) return 0;
        if(s.charAt(i)=='-'){sign=-1;i++;}
        else if(s.charAt(i)=='+'){sign=1;i++;}

        while(i<s.length()){
            int num =s.charAt(i)-'0';
            if(num<0 || num>9) break;
            res= res*10 + num;
            if(res*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)res*sign;
    }
}
