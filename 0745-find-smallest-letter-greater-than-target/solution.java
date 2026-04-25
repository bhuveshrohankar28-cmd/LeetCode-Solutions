class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       char C=letters[0];
       for(char ele:letters){
        if(ele>target) return ele;
       } return C;
    }
}
