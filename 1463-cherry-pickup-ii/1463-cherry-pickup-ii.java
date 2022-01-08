class Solution {
    public int cherryPickup(int[][] grid) {
        int fr_r = 0;
		int fr_c = 0;

		int sr_r = 0;
		int sr_c = grid[0].length - 1;

		HashMap<String, Integer> map = new HashMap<>();

        return cherryPickup(fr_r, fr_c, sr_r, sr_c, grid, map);
    }
    	private  int cherryPickup(int fr_r, int fr_c, int sr_r, int sr_c, int[][] grid,
			HashMap<String, Integer> map) {
				if (fr_r >= grid.length || sr_r >= grid.length || fr_c < 0 || fr_c >= grid[0].length || sr_c < 0 || sr_c >= grid[0].length) {
			return 0;
		}

		if (fr_r == grid.length - 1 && sr_r == grid.length - 1) {
			if (fr_c == sr_c) {
				return grid[fr_r][fr_c];
			}
			return grid[fr_r][fr_c] + grid[sr_r][sr_c];
		}

		String str = "" + fr_r + fr_c + sr_r + sr_c;
		if (map.containsKey(str)) {
			return map.get(str);
		}

		int count = 0;
		if (fr_r == sr_r && fr_c == sr_c) {
			count += grid[fr_r][fr_c];
		} else {
			count += grid[fr_r][fr_c] + grid[sr_r][sr_c];
		}

		// line calls for every combination
		int[] calls = new int[9];

		// 1
		calls[0] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c - 1, grid, map) + count;

		// 2
		calls[1] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c, grid, map) + count;

		// 3
		calls[2] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c + 1, grid, map) + count;

		// 4
		calls[3] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c - 1, grid, map) + count;

		// 5
		calls[4] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c, grid, map) + count;

		// 6
		calls[5] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c + 1, grid, map) + count;

		// 7
		calls[6] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c - 1, grid, map) + count;

		// 8
		calls[7] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c, grid, map) + count;

		// 9
		calls[8] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c + 1, grid, map) + count;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < calls.length; i++) {
			max = Math.max(max, calls[i]);
		}

		map.put("" + fr_r + fr_c + sr_r + sr_c, max);
		return max;
	}
}