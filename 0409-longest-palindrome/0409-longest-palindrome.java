class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+ 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int key : map.values()){
            if(key%2 == 0){
                ans+= key;
            }
            else{
                ans += key - 1;
                flag = true;
            }
        }
        return flag == true? ans + 1: ans;
    }
}