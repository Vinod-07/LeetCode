class Solution {
    public int divisorSubstrings(int num, int k) {
         String n = Integer.toString(num);
        int ws = 0, count = 0;
        for (int we =k ; we <= n.length(); we++) {
            int divisor = Integer.parseInt(n.substring(ws, we));
            ws++;
            if (divisor != 0 && num % divisor == 0) {
                count++;
            }
        }

        return count;
    }
}