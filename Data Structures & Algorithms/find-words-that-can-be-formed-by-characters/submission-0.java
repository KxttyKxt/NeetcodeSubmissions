class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsFreqMap = new HashMap<>();
		for (char c : chars.toCharArray())
			charsFreqMap.put(c, charsFreqMap.getOrDefault(c, 0) + 1);

		int count = 0;
		for (String word : words) {
			Map<Character, Integer> wordFreqMap = new HashMap<>();
			boolean wordIsGood = true;

			for (char c : word.toCharArray()) {
				wordFreqMap.put(c, wordFreqMap.getOrDefault(c, 0) + 1);
				wordIsGood = wordFreqMap.get(c) <= charsFreqMap.getOrDefault(c, 0);

				if (!wordIsGood) break;
			}

			if (wordIsGood)
				count += word.length();
		}

		return count;
    }
}