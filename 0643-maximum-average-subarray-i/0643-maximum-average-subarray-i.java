class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }

        double sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
         max = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; 
            max = Math.max(max, sum / k); 
        }

        return max;
    }
}