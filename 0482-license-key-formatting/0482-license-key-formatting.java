class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // s = s.toUpperCase();
        // char ans = ' ';
        // int count = 0;
        // for(char ch : s.toCharArray()){
        //     if(count <= k && ch != '-'){
        //         ans = ans + ch;
        //         count++;
        //     }
        //     else if(count == k){
        //         ans = ans + "-";
        //         count = 0;
        //     }
        // }
        // return ans.toString();
        if(s.length() <= k)
            return s.toUpperCase().replace("-","");
        s = s.toUpperCase().replace("-", "");
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            if(count == k){
                sb.append("-");
                count = 0;
            }
                sb.append(s.charAt(i));
                count++;
        }
       return sb.reverse().toString();
    }
}