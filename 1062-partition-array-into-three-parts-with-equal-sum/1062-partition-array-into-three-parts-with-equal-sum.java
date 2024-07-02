class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3 != 0){
            return false;
        }
        // int tempSum = sum/3;
            for(int i = 0; i < arr.length; i++){
                 sum1 += arr[i];
                if(sum1 == sum/3){
                    sum1 = 0;
                    count++;
                }

            }
        return count>=3;
    }
}