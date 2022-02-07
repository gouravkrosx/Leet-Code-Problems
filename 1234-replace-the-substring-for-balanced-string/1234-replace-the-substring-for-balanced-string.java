class Solution {
    public int balancedString(String s) {
        int[] count = new int[128];
        int n = s.length(), res = n, left = 0, k = n / 4;
        for (int j = 0; j < n; j++) {
            count[s.charAt(j)]++;
        }
        for (int right = 0; right < n; right++) {
            count[s.charAt(right)]--;
            while (left < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
                res = Math.min(res, right - left + 1);
                count[s.charAt(left++)]++;
            }
        }
        return res;
    }
}