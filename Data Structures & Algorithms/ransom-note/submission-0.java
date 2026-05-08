class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magFreqMap = new HashMap<>();
		for (char c : magazine.toCharArray())
			magFreqMap.put(c, magFreqMap.getOrDefault(c, 0) + 1);

		Map<Character, Integer> ransomFreqMap = new HashMap<>();
		for (char c : ransomNote.toCharArray()) {
			ransomFreqMap.put(c, ransomFreqMap.getOrDefault(c, 0) + 1);
			if (ransomFreqMap.get(c) > magFreqMap.getOrDefault(c, 0))
				return false;
		}

		return true;
    }
}