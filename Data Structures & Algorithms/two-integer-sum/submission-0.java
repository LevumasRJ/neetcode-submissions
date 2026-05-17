class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = map.getOrDefault(nums[i], -1);
            if (complement >= 0) {
                return new int[]{complement, i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }
}
