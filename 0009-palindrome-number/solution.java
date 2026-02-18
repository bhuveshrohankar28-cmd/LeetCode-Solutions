class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0; // Initialize a variable to store the reverse of the number
        int dup = x; // Create a duplicate variable to store the original number

        // Iterate through each digit of the number until it becomes 0
        while (x > 0) {
            int k = x % 10; // Extract the last digit of the number
            revNum = (revNum * 10) + k; // Build the reverse number by appending the last digit
            x = x / 10; // Remove the last digit from the original number
        }
            if (dup==revNum) {
                return true;
            }else return false;

                
        
       
    }
}


    

