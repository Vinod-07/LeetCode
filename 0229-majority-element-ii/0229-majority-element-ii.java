class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i <nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        // }

        // for(int val : map.keySet()){
        //     if(map.get(val) > (nums.length/3)){
        //         list.add(val);
        //     }
        // } 
        // return list;   
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // Phase 1: Find potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;


    }
}