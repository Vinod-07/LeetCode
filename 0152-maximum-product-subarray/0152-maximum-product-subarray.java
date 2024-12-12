class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int max = 0;
        int prefix = 1;
        int suffix = 1;
        for(int i = 0; i < nums.length; i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}