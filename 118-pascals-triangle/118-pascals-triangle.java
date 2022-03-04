class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();

		List<Integer> prev = new ArrayList<>();
		prev.add(1);
		ans.add(prev);
		for (int row = 1; row < numRows; row++) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < row + 1; i++) {
				if (i == 0 || i == row) {
					list.add(1);
				} else {
					int sum = prev.get(i - 1) + prev.get(i);
					list.add(sum);
				}
			}
			ans.add(list);
			prev = list;
		}
		return ans;
    }
}