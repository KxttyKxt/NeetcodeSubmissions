class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
		char[] chars = s.toCharArray();
		int maxFrequency = 0, res = 0;

		int l = 0;
		for (int r = 0; r < chars.length; r++) {
			count.put(chars[r], count.getOrDefault(chars[r], 0) + 1);
			maxFrequency = Math.max(maxFrequency, count.get(chars[r]));

			while ((r - l + 1) - maxFrequency > k) {
				count.put(chars[l], count.get(chars[l]) - 1);
				l++;
			}

			res = Math.max(res, r - l + 1);
		}

		return res;
    }
}
