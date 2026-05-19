class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.trim().toLowerCase().toCharArray();

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char left = arr[i];
            char right = arr[j];
            if (!Character.isLetterOrDigit(left)) {
                i++;
            } else if (!Character.isLetterOrDigit(right)) {
                j--;
            } else {
                if (left != right)
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
