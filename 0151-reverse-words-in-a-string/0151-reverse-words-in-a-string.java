class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=word.length-1 ; i>=0; i--){
                sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();
    }
}