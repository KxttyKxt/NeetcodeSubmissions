class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr)
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

		int biggestLucky = -1;
		for (int key : freqMap.keySet())
			if (key == freqMap.get(key))
				biggestLucky = Math.max(biggestLucky, key);
		
		return biggestLucky;
    }
}