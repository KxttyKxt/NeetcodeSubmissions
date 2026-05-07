class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr)
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

		return Arrays.stream(arr)
				.filter(num->num==freqMap.get(num))
				.max()
				.orElse(-1);
    }
}