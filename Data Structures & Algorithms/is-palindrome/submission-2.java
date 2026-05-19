class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        
        while (l < r) {
            char leftChar = arr[l];
            char rightChar = arr[r];
            
            if (!Character.isLetterOrDigit(leftChar)) {
                l++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                r--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
