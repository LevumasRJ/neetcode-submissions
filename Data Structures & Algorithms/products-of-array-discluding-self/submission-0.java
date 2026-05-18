class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];

        int leftProducts = 1, rightProducts = 1;
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            prefix[i] = leftProducts;
            leftProducts *= nums[i];
            suffix[j] = rightProducts;
            rightProducts *= nums[j];
        }

        for (int i = 0; i < size; i++) {
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
}  
