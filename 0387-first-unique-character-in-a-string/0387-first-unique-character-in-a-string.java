class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (int i =0 ; i< chars.length; i++){
            freq[chars[i]-'a']++;
        }
        for (int i =0 ; i< chars.length; i++){
            if(freq[chars[i]-'a']==1){
                return  i;
            }
        }
        return -1;
    }
}