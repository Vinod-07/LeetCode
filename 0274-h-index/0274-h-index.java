class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int n = c.length;
        for(int i = 0; i < c.length; i++){
            int h = n - i;
            if(c[i] >= h){
                return h;
            }
        }
        return 0;
    }
}