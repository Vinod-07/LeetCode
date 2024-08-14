class Solution {
    public boolean detectCapitalUse(String word) {
        // char[] ch = word.toCharArray();
        // boolean flag = true;
        // if(ch.length == 1){
        // return true;
        // }
        // for(int i = 0; i < ch.length; i++){
        // int a = ch[i];
        // if(a>90){
        // flag = false;
        // }
        // }
        // if(ch[0] < 90){
        // int len = ch.length;
        // for(int i = 1; i < ch.length; i++){
        // if(ch[i] > 90){
        // len--;
        // }
        // }
        // if(len == 1){
        // return true;
        // }
        // }
        // if(ch[0] > 90){
        // int len = ch.length;
        // for(int i = 0; i < ch.length; i++){
        // if(ch[i] > 90){
        // len--;
        // }
        // }
        // if(len == 0){
        // return true;
        // }
        // }
        // if(flag == false){
        // return flag;
        // }
        // return flag;

        int capital = 0, small = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                small++;
            else
                capital++;
        }
        if ((capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) || capital == word.length()
                || word.length() == 1 || capital == 0)
            return true;
        return false;
    }
}