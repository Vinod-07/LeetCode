class Solution {
    public boolean checkRecord(String s) {
        int ca = 0;
        int cl = 0;
        for (char ch : s.toCharArray()) {
            char a = ch;
            if (a == 'A') {
                ca++;
            } 
             if (a == 'L') {
                cl++;
                if (cl >= 3) {
                    return false;
                }
            }
            if(a == 'A' || a == 'P') {
                cl = 0;
            }
        }
        if( ca < 2 && cl < 3)
            return true;
        else
        return false;
    }
}