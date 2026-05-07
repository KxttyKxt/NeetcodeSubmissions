class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

		for (char c : s.toCharArray()) {
			freqMap.putIfAbsent(c, 0);
			freqMap.put(c, freqMap.get(c) + 1);
		}

		int maxOddFrequency = freqMap
				.values()
				.stream()
				.filter(freq -> freq % 2 == 1)
				.max(Comparator.comparingInt(freq -> freq))
				.orElse(0);

		int minEvenFrequency = freqMap
				.values()
				.stream()
				.filter(freq -> freq % 2 == 0)
				.min(Comparator.comparingInt(freq -> freq))
				.orElse(0);

		return maxOddFrequency - minEvenFrequency;
    }
}