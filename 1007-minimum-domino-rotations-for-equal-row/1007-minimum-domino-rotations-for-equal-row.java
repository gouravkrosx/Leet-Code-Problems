class Solution {
/*
If it is possible to create a row of identical numbers, a[0] or b[0] must be in this solution.
If a[0] and b[0] are both in the solution, they are either the same number or there are only two numbers in all dominoes

A = [1,1,1,1]
B = [1,1,1,1]
or
A = [1,2,1,2]
B = [2,1,2,1]

*/    
   public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == A[0] || B[i] == A[0]); ++i) {
            if (A[i] != A[0]) a++;
            if (B[i] != A[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == B[0] || B[i] == B[0]); ++i) {
            if (A[i] != B[0]) a++;
            if (B[i] != B[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        return -1;
    }
}