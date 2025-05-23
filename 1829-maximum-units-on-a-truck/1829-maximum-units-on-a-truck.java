class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); 
        int total = 0;
        for (int[] boxType : boxTypes) {
            int boxCount = Math.min(truckSize, boxType[0]);
            total += boxCount * boxType[1];
            truckSize -= boxCount;
            if (truckSize == 0) {
                break;
            }
        }
        return total;
    }
}