class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length())
			return new ArrayList<>();

		List<Integer> list = new ArrayList<>();

		int[] win = new int[26];

		int[] pat = new int[26];

		int size = p.length();

		for (int i = 0; i < size; i++) {
			pat[p.charAt(i) - 'a']++;
			win[s.charAt(i) - 'a']++;
		}

		// checking for first window

		boolean fl = true;
		for (int i = 0; i < 26; i++) {
			if (win[i] != pat[i]) {
				fl = false;
				break;
			}
		}

		if (fl) {
			list.add(0);
		}

		int k = 0;
		int j = size;

		while (j < s.length()) {

			win[s.charAt(k) - 'a']--;
			k++;

			win[s.charAt(j) - 'a']++;
			j++;

			fl = true;

			for (int i = 0; i < 26; i++) {
				if (win[i] != pat[i]) {
					fl = false;
					break;
				}
			}

			if (fl) {
				list.add(k);
			}

		}

		return list;
    }
}