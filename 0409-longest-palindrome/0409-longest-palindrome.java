class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        int[] counts = new int[128];
        for (char c : s.toCharArray()) {
            counts[c]++;
        }

        for (int count : counts) {
            length += count / 2 * 2;
            if (length % 2 == 0 && count % 2 != 0) {
                length += 1;
            }
        }

        return length;
    }
}