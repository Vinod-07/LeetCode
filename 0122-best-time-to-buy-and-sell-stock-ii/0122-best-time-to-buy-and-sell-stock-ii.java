class Solution {
    public int maxProfit(int[] p) {
        // int s = 0;
        // int e = 1;
        // int buy = 0;
        // int sell = 0;
        // int ans = 0;
        // while(e < p.length){
        //     if(p[s+1] < p[s]){
        //         buy = p[s+1];
        //     }
        //     else{
        //         s++;
        //     }
        //     if(p[e-1] > p[e]){
        //         sell = p[e] - buy;
        //         s = e;
        //         e = e+1;
        //         ans +=sell;
        //     }
        //     else{
        //         e++;
        //     }
        // }
        // return ans;

        int ans = 0;
        for(int i = 1; i<p.length; i++){
            if(p[i] > p[i-1]){
                ans += p[i] - p[i-1];
            }
        }
        return ans;
    }
}