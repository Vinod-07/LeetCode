class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] moss = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    String[] ans = new String[words.length];
    HashSet<String> set = new HashSet<>();
    for(int i = 0; i < words.length; i++){
        for(int j = 0; j < words[i].length(); j++){
            ans[i] = ans[i] + moss[words[i].charAt(j) - 'a'];
        }
        set.add(ans[i]);
    }
    return set.size();    
}
}