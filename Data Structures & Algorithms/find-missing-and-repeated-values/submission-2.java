class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int[] row : grid) {
			for (int value : row) {
				freqMap.putIfAbsent(value, 0);
				freqMap.put(value, freqMap.get(value) + 1);
			}
		}

		int repeated= 0, missing = 0;
		for (int num = 1; num <= grid.length * grid.length; num++) {
			int freq = freqMap.getOrDefault(num, 0);

			if (freq == 0) missing = num;
			if (freq == 2) repeated = num;

			if (repeated != 0 && missing != 0)
				break;
		}

		return new int[]{repeated, missing};
    }
}