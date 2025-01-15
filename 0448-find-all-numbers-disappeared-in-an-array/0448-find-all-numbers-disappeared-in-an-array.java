class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            if(set.contains(i+1)){
                continue;
            }
            else{
                list.add(i+1);
            }
        }
        return list;
    }
}