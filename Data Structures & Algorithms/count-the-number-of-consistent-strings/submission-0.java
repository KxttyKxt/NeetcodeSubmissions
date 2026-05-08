class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

		for (String word : words) {
			boolean wordIsGood = true;

			for (char c : word.toCharArray()) {
				wordIsGood = allowed.indexOf(c) != -1;
				if (!wordIsGood)
					break;
			}
            
			if (wordIsGood)
				count++;
		}

		return count;
    }
}