class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
      	// print both the arrays (sum & mat) and also dry run to understand how this prefix sum is
		// being made.
		// sum[i][j] represents the sum of all the elements which makes the rectangle
		// having coordinates -> (0,0),(0,j),(i,0),(i,j);

		int m = mat.length;
		int n = mat[0].length;
		int[][] sum = new int[m + 1][n + 1];

		int res = 0;
		int len = 1;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				 // -sum[i-1][j-1] to remove the overlapping part.
				sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + mat[i - 1][j - 1];

				// +sum[i-len][j-len] to add the part which got deleted two times due to overlapping;
				if (i >= len && j >= len
						&& sum[i][j] - sum[i - len][j] - sum[i][j - len] + sum[i - len][j - len] <= threshold) {  
					res = len;
					len++;
				}

			}
		}
		return res;
    }
}