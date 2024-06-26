class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int st = 0;
        int e = s.length()-1;
        String vow = "aeiouAEIOU";

        while(st<e){
            while(st<e && vow.indexOf(str[st]) == -1){
                st++;
            }
            while(st<e && vow.indexOf(str[e]) == -1){
                e--;
            }

            char temp = str[st];
            str[st] = str[e];
            str[e] = temp;

            st++;
            e--;
        }

        String ans = new String(str);
        return ans;
    }
}