class Solution {
    public boolean isPalindrome(String s) {
        int first = 0, last = s.length() - 1;
        while (first < last) {
            char f = s.charAt(first);
            char l = s.charAt(last);
            if (isAlphanumeric(f)) {
                if (isAlphanumeric(l)){
                    if (toUpperCase(f) != toUpperCase(l)) {
                        return false;
                    } else {
                        first++; last--;
                    }
                } else {
                    last--;
                }
            } else {
                first++;
            }
        }
        return true;
    }

    boolean isAlphanumeric(char c) {
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