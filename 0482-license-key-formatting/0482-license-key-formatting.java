class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String s1 = s.replace("-","");
        s1 = s1.toUpperCase();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s1.length(); i++){
            sb.append(s1.charAt(i));
        }
        int len = sb.toString().length();

        for(int i=k; i<len; i=i+k){
            sb.insert(len-i,'-');
        }

        return sb.toString();

    }
}