class Solution {
    public String kthDistinct(String[] arr, int k) {
        // LinkedHashMap preserves order
		Map<String, Integer> freqMap = new LinkedHashMap<>();
		for (String str : arr) {
			freqMap.putIfAbsent(str, 0);
			freqMap.put(str, freqMap.get(str) + 1);
		}

		String[] distinct = freqMap
				.keySet()
				.stream()
				.filter(str->freqMap.get(str)==1)
				// using .toArray() here would force it to be of type Object[],
				// which cannot be cast to String[] without throwing an Exception
				.toList()
				.toArray(new String[0]);

		return k > distinct.length ? "" : distinct[k-1];
    }
}