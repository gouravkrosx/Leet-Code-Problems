class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3){
            return 0;
        }
     int n = arr.length;

		boolean gp = true; // going up
		int i = 0, j = 1;
		int ans = 0;
		int c = 0;

		while (j < n) {
			if (arr[j - 1] == arr[j]) {
				i = j;
				j++;
				c = 0;
				continue;
			}
			if (gp) {
				if (arr[j - 1] > arr[j]) {
					if (c == 1) {
						gp = false;
					} else {
						i = j;
						j++;
					}

				} else {
					j++;
					c = 1;
				}
			} else {
				if (arr[j - 1] > arr[j]) {
					ans = Math.max(ans, j - i + 1);
					j++;
					c = 1;
				} else {
					i = j - 1;
					gp = true;
					c = 0;
				}
			}
		}

		return ans;
    }
}