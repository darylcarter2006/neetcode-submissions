class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if(!check.add(nums[i])) return true;
        }

        return false;
    }
}