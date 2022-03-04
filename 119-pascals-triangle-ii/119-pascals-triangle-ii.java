class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
		prev.add(1);
		for (int row = 1; row < rowIndex+1; row++) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < row + 1; i++) {
				if (i == 0 || i == row) {
					list.add(1);
				} else {
					int sum = prev.get(i - 1) + prev.get(i);
					list.add(sum);
				}
			}
			prev = list;
		}
		return prev;
    }
}