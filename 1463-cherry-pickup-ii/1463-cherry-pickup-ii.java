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
		if (fr_r >= grid.length || sr_r >= grid.length || fr_c < 0 || fr_c >= grid[0].length || sr_c < 0
				|| sr_c >= grid[0].length) {
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

		// line calls for every combination
		int[] calls = new int[9];

		// 1
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[0] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c];

		} else {
			calls[0] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];

		}

//		System.out.println(calls[0]);

		// 2
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[1] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[1] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[1]);

		// 3
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[2] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[2] = cherryPickup(fr_r + 1, fr_c - 1, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[2]);

		// 4
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[3] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[3] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[3]);

		// 5
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[4] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[4] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c] + grid[sr_r][sr_c];
		}

//		System.out.println(calls[4]);

		// 6
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[5] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[5] = cherryPickup(fr_r + 1, fr_c, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[5]);

		// 7
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[6] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[6] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c - 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[6]);

		// 8
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[7] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[7] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[7]);

		// 9
		if (fr_r == sr_r && fr_c == sr_c) {
			calls[8] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c];
		} else {
			calls[8] = cherryPickup(fr_r + 1, fr_c + 1, sr_r + 1, sr_c + 1, grid, map) + grid[fr_r][fr_c]
					+ grid[sr_r][sr_c];
		}

//		System.out.println(calls[8]);

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < calls.length; i++) {
			max = Math.max(max, calls[i]);
		}

		map.put("" + fr_r + fr_c + sr_r + sr_c, max);
		return max;
	}
}