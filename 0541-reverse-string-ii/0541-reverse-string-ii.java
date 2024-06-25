class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int loop = (s.length() / 2*k);
        
        for(int i = 0; i < s.length() - 1; i+=(k*2)){
            int low = i;
            int high = Math.min(i+k-1,s.length()-1);
            while(low < high){ 
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
            }

        }

        s = new String(chars);
        return s;
       
    }
}