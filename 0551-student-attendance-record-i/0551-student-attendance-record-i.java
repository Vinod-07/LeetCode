class Solution {
    public boolean checkRecord(String s) {
        // int ca = 0;
        // int cl = 0;
        // for (char ch : s.toCharArray()) {
        //     char a = ch;
        //     if (a == 'A') {
        //         ca++;
        //     } 
        //      if (a == 'L') {
        //         cl++;
        //         if (cl >= 3) {
        //             return false;
        //         }
        //     }
        //     if(a == 'A' || a == 'P') {
        //         cl = 0;
        //     }
        // }
        // if( ca < 2 && cl < 3)
        //     return true;
        // else
        // return false;


        String str = "LLL";
        if(s.contains(str)){
            return false;
        }

        int a = 0;
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == 'A'){
                a++;
            }
        }
        return (a < 2) ? true : false;
    }
}