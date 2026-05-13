class Solution {
    public String minWindow(String s, String t) {
        if (s.equals(t)) return s;
        if (t.isEmpty() || s.length() < t.length()) return "";

		Map<Character, Integer> windowCount = new HashMap<>();
		Map<Character, Integer> tCount = new HashMap<>();

		for (char c : t.toCharArray())
			tCount.put(c, tCount.getOrDefault(c, 0) + 1);

		int have = 0, need = tCount.size();
		int[] result = {-1, -1};
		int resultLen = 1001; // max + 1 after constraint

		int l = 0;
		for (int r = 0; r < s.length(); r++) {
			char c = s.charAt(r);
			windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

			if (tCount.containsKey(c) && windowCount.get(c).equals(tCount.get(c)))
				have++;

			while (have == need) {
				if (r - l + 1 < resultLen) {
					result[0] = l;
					result[1] = r;
					resultLen = r - l + 1;
				}

				char cFromL = s.charAt(l++);
				windowCount.put(cFromL, windowCount.get(cFromL) - 1);

				if (tCount.containsKey(cFromL) && windowCount.get(cFromL) < tCount.get(cFromL))
					have--;
			}
		}

		return resultLen < 1001 ? s.substring(result[0], result[1] + 1) : "";
    }
}
