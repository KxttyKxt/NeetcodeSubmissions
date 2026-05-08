class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : nums)
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

		PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		for (int key : freqMap.keySet()) {
			heap.offer(new int[]{freqMap.get(key), key});
			if (heap.size() > k)
				heap.poll();
		}

		int[] topKFrequent = new int[k];
		for (int i = 0; i < k; i++)
			topKFrequent[i] = Objects.requireNonNull(heap.poll())[1];
		return topKFrequent;
    }
}
