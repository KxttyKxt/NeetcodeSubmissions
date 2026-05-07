class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mappedAnagrams = new HashMap<>();

		for (String s: strs) {
			char[] sortedChars = s.toCharArray();
			Arrays.sort(sortedChars);
			String sorted = new String(sortedChars);

			if (mappedAnagrams.containsKey(sorted))
				mappedAnagrams.get(sorted).add(s);
			else {
				List<String> newList = new ArrayList<>();
				newList.add(s);
				mappedAnagrams.put(sorted, newList);
			}
		}

		return List.copyOf(mappedAnagrams.values());
    }
}
