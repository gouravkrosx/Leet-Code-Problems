class Solution {
    public int lengthOfLIS(int[] nums) {

		ArrayList<Integer> temp = new ArrayList<>();

		temp.add(nums[0]);
		int len = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > temp.get(temp.size() - 1)) {
				len++;
				temp.add(nums[i]);
			} else {
				int[] arr = temp.stream().mapToInt(id -> id).toArray();
				int idx = LowerBound(arr, 0, temp.size(), nums[i]);
				temp.set(idx, nums[i]);
			}
		}

		return len; // or temp.size();
	}

	public static int LowerBound(int[] arr, int l, int r, int val) { 
		int ans = arr.length;
		while (l <= r) {
			int m = (l + r) >> 1;
			if (arr[m] >= val) {
				ans = m;
				r = m - 1;
			} else
				l = m + 1;
		}
		return ans;
	}
}