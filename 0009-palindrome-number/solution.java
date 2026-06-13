class Solution {//again
    public boolean isPalindrome(int x) {
        int revNum = 0; 
        int dup = x; 

        
        while (x > 0) {
            int k = x % 10; 
            revNum = (revNum * 10) + k; 
            x = x / 10; 
        }
            if (dup==revNum) {
                return true;
            }else return false;

                
        
       
    }
}


    

