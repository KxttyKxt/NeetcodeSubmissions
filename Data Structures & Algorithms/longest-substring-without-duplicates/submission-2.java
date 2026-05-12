class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int N = s.length();
		if (N <= 1) return N;

		Map<Character, Integer> charIndexMap = new HashMap<>();
		char[] chars = s.toCharArray();

		int l = 0, longest = 0;
		for (int r = 0; r < N; r++) {
			if (charIndexMap.containsKey(chars[r]))
				l = Math.max(l, charIndexMap.get(chars[r]) + 1);
			charIndexMap.put(chars[r], r);
			longest = Math.max(longest, r - l + 1);
		}

		return longest;
    }
}
