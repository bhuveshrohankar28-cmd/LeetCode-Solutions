class Solution {
    public String greatestLetter(String s) {
        for (char i = 'Z'; i >= 'A'; i--) {
            if (s.indexOf(i) != -1 && s.indexOf(i + 32) != -1) {
                return Character.toString(i);
            }
        }
        return "";
    }
}


