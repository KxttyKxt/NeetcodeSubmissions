class Solution {
    public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		Map<Character, Integer> sFreqMap = new HashMap<>();
		Map<Character, Integer> tFreqMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			sFreqMap.put(s.charAt(i), sFreqMap.getOrDefault(s.charAt(i), -1) + 1);
			tFreqMap.put(t.charAt(i), tFreqMap.getOrDefault(t.charAt(i), -1) + 1);
		}

		return sFreqMap.equals(tFreqMap);
    }
}
