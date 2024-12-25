class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort the array in descending order
        Arrays.sort(citations);
        int n = citations.length;

        // Step 2: Traverse the sorted array and find the H-Index
        for (int i = 0; i < n; i++) {
            int h = n - i; // Number of papers with at least citations[i] citations
            if (citations[i] >= h) {
                return h;
            }
        }

        // If no valid H-Index is found, return 0
        return 0;
    }
}
