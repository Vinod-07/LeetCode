class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length != nums[nums.length-1]){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return 0;
    }
}