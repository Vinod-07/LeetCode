class Solution {
    public int countBinarySubstrings(String s) {
        int cur = 1, prev = 0, sum = 0;
for(int i =1; i < s.length(); i++)    {
        if(s.charAt(i) == s.charAt(i-1)){
                cur++;
            }
            else{
            sum+= Math.min(cur,prev);
            prev = cur;
            cur = 1;
            }
        }
        sum+=Math.min(cur, prev);
        return sum;
    }
}