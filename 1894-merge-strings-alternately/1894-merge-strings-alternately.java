class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int s1 = 0;
        int s2 = 0;
        int l1 = word1.length();
        int l2 = word2.length();
        while(s1 < l1 || s2 < l2){
            if(s1 < l1){
            sb.append(word1.charAt(s1));
            s1++;
            }
            if(s2 < l2){
            sb.append(word2.charAt(s2));
            s2++;
            }
        }
        return sb.toString();
    }
}