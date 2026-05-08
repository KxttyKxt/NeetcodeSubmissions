class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : nums)
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

		int[] keysByFreq = freqMap.keySet()
				.stream()
				.sorted((a,b) -> freqMap.getOrDefault(b, 0) - freqMap.getOrDefault(a, 0))
				.mapToInt(num->num)
				.toArray();

		return Arrays.copyOfRange(keysByFreq, 0, k);
    }
}
