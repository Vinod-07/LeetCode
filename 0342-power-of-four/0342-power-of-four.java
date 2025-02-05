class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false; // Power of 4 must be positive

        while (n % 4 == 0) { // Keep dividing by 4 if divisible
            n /= 4;
        }

        return n == 1; // If reduced to 1, it's a power of 4
    }
}
