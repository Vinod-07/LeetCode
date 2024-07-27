class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        int x = 0;
        for(int i=0; i<arr.length; i++){
            if(nums[i] != 0){
                arr[j] = nums[i];
                j++;
            }
            else{
                arr[nums.length - 1-x] = 0;
                x++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i]=arr[i];
        }
    }
}