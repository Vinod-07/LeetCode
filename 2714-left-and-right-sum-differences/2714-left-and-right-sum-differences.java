class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int[] ans = new int[nums.length];
        // int[] lsum = new int[nums.length];
        // lsum[0] = nums[0];
        // int[] rsum = new int[nums.length];
        // rsum[nums.length-1] = nums[nums.length-1];
        // for(int i = 1; i < nums.length; i++){
        //     lsum[i] = lsum[i-1]+nums[i];
        // }
        // for(int i = nums.length-2; i>=0; i--){
        //     rsum[i] = rsum[i+1]+nums[i];
        // }
        // for(int i = 0; i < nums.length; i++){
        //     ans[i] = Math.abs(lsum[i] - rsum[i]);
        // }
        // return ans;
        int[] ans = new int[nums.length];
        int rsum = 0;
        int lsum = 0;
        for(int i:nums){
            rsum+=i;
        }       
        for(int i = 0; i < nums.length; i++){
            rsum -= nums[i];
            ans[i] = Math.abs(lsum-rsum);
            lsum+=nums[i];
        } 
        return ans;
    }
}