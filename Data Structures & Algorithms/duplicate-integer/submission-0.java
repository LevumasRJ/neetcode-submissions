class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i: nums) {
            if (!uniqueValues.add(i))
                return true;
        }
        return false;
    }
}