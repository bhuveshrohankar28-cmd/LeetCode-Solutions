class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder captitle=new StringBuilder();
        for(String word:words){
            if(word.length()>2){
               char firstLetter=Character.toUpperCase(word.charAt(0));
               String lower=word.substring(1).toLowerCase();
                captitle.append(firstLetter).append(lower).append(" ");

            }else captitle.append(word.toLowerCase()).append(" ");
        }return captitle.toString().trim();
    }
}
