class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int i = 0, j = nums.length-1;

      while(i < j){

        while(i<j && nums[i]%2 == 0){
            i++;
        }
        while(i<j && nums[j]%2 != 0){
            j--;
        }
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        i++;
        j--;
      }
      return nums;
    }
}