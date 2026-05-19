class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int best = 0;
        while (l < r) {
            int lVal = heights[l];
            int rVal = heights[r];
            int min = Math.min(lVal, rVal);
            int current = min * (r - l);
            if (current > best) {
                best = current;
            }
            if (min == lVal && min == rVal) {
                l++;
                r--;
            } else if (min == lVal){
                l++;
            } else {
                r--;
            }
        }
        return best;
    }
}
