class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;
        char start = s.charAt(first);
        char end = s.charAt(last);
        while(first < last){
            if(Alphanumeric(start)){
                if(Alphanumeric(end)){
                    if(toUpperCase(start) != toUpperCase(end)){
                        return false;
                    }
                    else{
                    first++;
                    last--;
                    }                    
                }
                else
                last--;                
            }
            else
            first++;
        }
        return true;
    }
    boolean Alphanumeric(char c){
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) ('A' + (char) c - 'a');
        }
        return c;
    }
}