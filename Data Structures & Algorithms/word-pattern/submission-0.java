class Solution {
    public boolean wordPattern(String pattern, String s) {
        // reminds me of isIsomorphic()
		List<String> patternList = pattern.chars().mapToObj(c -> (char) c).map(String::valueOf).toList();
		List<String> wordsList = List.of(s.split(" "));

		if (patternList.size() != wordsList.size())
			return false;

		int len = patternList.size();
		int[] patternMorphs = new int[len];
		int[] wordsMorphs = new int[len];

		for (int i = 0; i < len; i++) {
			patternMorphs[i] = patternList.indexOf(patternList.get(i));
			wordsMorphs[i] = wordsList.indexOf(wordsList.get(i));

			if (!Arrays.equals(patternMorphs, wordsMorphs))
				return false;
		}

		return true;
    }
}