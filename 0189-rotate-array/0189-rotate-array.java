class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // int x = k%n;
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[(i+x) % n] = nums[i];
        // }
        // for(int i = 0; i < n; i++){
        //     nums[i] = arr[i];
        // }

         k = k%n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n -1);
    }
    private void reverse(int[] nums, int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}