class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length < 2)
			// using List.of() on NeetCode somehow throws
			//  an UnsupportedOperationException
			return new ArrayList<>();

		SortedSet<Integer> sortedNums = new TreeSet<>(Arrays.stream(nums).boxed().toList());

		List<Integer> disappearedNums = new ArrayList<>();
		for (int i = 1; i <= nums.length; i++)
			if (!sortedNums.contains(i))
				disappearedNums.add(i);

		return disappearedNums;
    }
}