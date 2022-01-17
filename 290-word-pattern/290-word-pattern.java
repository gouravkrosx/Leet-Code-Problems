class Solution {
    public boolean wordPattern(String pattern, String s) {
        	char[] arr = pattern.toCharArray();
		String[] brr = s.split(" ");

		if (arr.length != brr.length)
			return false;

		int n = arr.length;

		HashMap<String, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			if (!map.containsKey(brr[i])) {
				if (!set.contains(arr[i])) {
					map.put(brr[i], arr[i]);
					set.add(arr[i]);
				} else {
					return false;
				}
			} else {
				if (map.get(brr[i]) == arr[i]) {

				} else {
					return false;
				}
			}
		}

		return true;
    }
}