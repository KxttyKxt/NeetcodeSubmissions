class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

		for (int num: nums) {
			occurrenceMap.putIfAbsent(num, 0);
			occurrenceMap.put(num, occurrenceMap.get(num) + 1);
		}

		int majorityElement = (int) occurrenceMap.keySet().toArray()[0];
		for (int key : occurrenceMap.keySet())
			if (occurrenceMap.get(key) > occurrenceMap.get(majorityElement))
				majorityElement = key;

		return majorityElement;
    }
}