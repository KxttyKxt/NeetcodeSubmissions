class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> toReturn = new LinkedHashSet<>(words.length);

		for (String word : words)
			for (String superstring : words)
				if (!word.equals(superstring) && superstring.contains(word))
					toReturn.add(word);

		return List.copyOf(toReturn);
    }
}