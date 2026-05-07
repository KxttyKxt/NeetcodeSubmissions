class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = -1, missing = -1;

		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int[] row : grid) {
			for (int value : row) {
				freqMap.putIfAbsent(value, 0);
				freqMap.put(value, freqMap.get(value) + 1);

				if (freqMap.get(value) == 2) {
					repeated = value;
					break;
				}
			}
			if (repeated != -1)
				break;
		}

		List<Integer> sorted = Arrays.stream(grid).flatMapToInt(Arrays::stream).sorted().boxed().toList();
		for (int i = 1; i <= sorted.size(); i++) {
			if (!sorted.contains(i)) {
				missing = i;
				break;
			}
		}

		return new int[]{repeated, missing};
    }
}