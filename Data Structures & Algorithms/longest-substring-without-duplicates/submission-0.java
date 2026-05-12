class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int N = s.length();
		if (N <= 1) return N;

		Set<Character> charSet = new HashSet<>();
		int l = 0, r, max = 0;
		for (r = 0; r < N; r++) {
			while (charSet.contains(s.charAt(r)))
				charSet.remove(s.charAt(l++));
			charSet.add(s.charAt(r));
			max = Math.max(max, r - l + 1);
		}

		return max;
    }
}
