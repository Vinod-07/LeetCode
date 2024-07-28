class Solution {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length+1];
        int min = 101;
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i - 1];
            min = Math.min(prefix[i] , min);
        }
        
        return (Math.abs(min) + 1);
    }
}