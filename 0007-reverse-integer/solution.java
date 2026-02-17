class Solution {
    public int reverse(int x) {
       
        
        long  temp=x;
      long sum=0;
      long rem=0;
        while (temp!=0) {
             rem=temp%10;
            sum=(sum*10)+rem;
            temp/=10;}
        if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
            return 0;
        }
        return (int)sum;
    }
}
    

