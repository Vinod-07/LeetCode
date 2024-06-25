class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String ch = " ";
        for(int i = 0; i < str.length; i++){
            ch+= strRev(str[i]);
            if(i < str.length-1){
                ch+=" ";
            }
        }
        return ch.trim();
    }
    public String strRev(String ss){
        char[] a = ss.toCharArray();
        int st = 0;
            int e = a.length-1;
            while(st < e){
                char temp = a[st];
                a[st] = a[e];
                a[e]=temp;
                st++;
                e--;
            }
            String s1 = new String(a);
            return s1;
    }
}