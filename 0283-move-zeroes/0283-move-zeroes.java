class Solution {
    public void moveZeroes(int[] nums) {
        // int[] arr = new int[nums.length];
        // int j = 0;
        // int x = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(nums[i] != 0){
        //         arr[j] = nums[i];
        //         j++;
        //     }
        //     else{
        //         arr[nums.length - 1-x] = 0;
        //         x++;
        //     }
        // }
        // for(int i = 0; i < nums.length; i++){
        //     nums[i]=arr[i];
        // }

        if(nums.length == 0){
            return;
        }
        int s = 0, e = 1;
        while(s<e){
            if(nums[s] == 0 && nums[e] != 0){
                int temp = s;
                s = e;
                e = temp;
                s++;
                e++;
            }
            else if(nums[s] == 0 && nums[e] ==0){
                e++;
            }
            else{
                s++;
                e++;
            }
        }
    }
    // public void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
}