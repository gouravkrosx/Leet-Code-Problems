class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
		int i = 0;
		while (i < s.length()) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			freq[ch1 - 'a']--;
			freq[ch2 - 'a']++;
			i++;
		}
		freq[t.charAt(t.length() - 1) - 'a']++;
        
		for (int j = 0; j < 26; j++) {
			if (freq[j] > 0) {
				return (char) ('a' + j);
			}
		}
		return 0;
    }
}