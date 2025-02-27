import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value)){
                return new int[]{ map.get(value)+1,i+1};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}