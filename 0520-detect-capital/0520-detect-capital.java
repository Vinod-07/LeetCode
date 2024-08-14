class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        boolean flag = true;
        if(ch.length == 1){
            return true;
        }
        for(int i = 0; i < ch.length; i++){
            int a = ch[i];
            if(a>90){
                flag = false;
            }
        }
        if(ch[0] < 90){
            int len = ch.length;
            for(int i = 1; i < ch.length; i++){
                if(ch[i] > 90){
                    len--;
                }
            }
            if(len == 1){
                return true;
            }
        }
        if(ch[0] > 90){
            int len = ch.length;
            for(int i = 0; i < ch.length; i++){
                if(ch[i] > 90){
                    len--;
                }
            }
            if(len == 0){
                return true;
            }
        }
        if(flag == false){
            return flag;
        }
        return flag;
    }
}