class Solution {
    public int[] shortestToChar(String s, char c) {
        int min = Integer.MAX_VALUE;
        char[] str = new char[s.length()];
        str = s.toCharArray();
        int[] ans = new int[s.length()];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                if(str[j] == c ){
                    min = Math.abs(Math.min(min, j-i));
                    ans[i] = min;
                }
                if(str[i] == c){
                    ans[i] = 0;
                }
            }
        }
        return ans;
    }
}