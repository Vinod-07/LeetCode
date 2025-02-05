class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; // Edge case

        char[] hexChars = "0123456789abcdef".toCharArray(); // Mapping hex values
        StringBuilder hex = new StringBuilder();

        while (num != 0) {
            int digit = num & 0xF; // Extract the last 4 bits
            hex.append(hexChars[digit]); // Get corresponding hex char
            num >>>= 4; // Unsigned right shift (handles negative numbers)
        }

        return hex.reverse().toString(); // Reverse since we processed LSB first
    }
}
