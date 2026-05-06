class Solution {
    public double myPow(double x, long n) {
        if(n<0){ 
            x=1/x;
            n=-n;
        }
         if(n==0) return 1;
         if(n==1) return x;
         double halfPower= myPow(x,n/2);
         if(n%2==0) return halfPower*halfPower;
         else return x*halfPower*halfPower; 

    }
}
