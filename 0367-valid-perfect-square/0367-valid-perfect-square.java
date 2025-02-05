// class Solution {
//     public boolean isPerfectSquare(int num) {
//         if (num < 1) return false; // Edge case

//         long left = 1, right = num;
        
//         while (left <= right) {
//             long mid = left + (right - left) / 2;
//             long square = mid * mid;
            
//             if (square == num) return true; // Found perfect square
//             else if (square < num) left = mid + 1;
//             else right = mid - 1;
//         }
        
//         return false; // No perfect square found
//     }
// }


class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        
        long x = num;
        while (x * x > num) { // Continue refining x
            x = (x + num / x) / 2; // Newton's formula
        }
        
        return x * x == num; // Check if it's a perfect square
    }
}
