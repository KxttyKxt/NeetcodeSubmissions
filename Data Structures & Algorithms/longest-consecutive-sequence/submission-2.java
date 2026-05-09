class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
			return 0;

		Set<Integer> numSet = new HashSet<>();
		for (int num : nums)
			numSet.add(num);

		int longest = 1;
		for (int num : numSet) {
			if (!numSet.contains(num - 1)) {
				int current = 1;
				while (numSet.contains(num + current))
					current++;
				longest = Math.max(longest, current);
			}
		}

		return longest;
    }
}
