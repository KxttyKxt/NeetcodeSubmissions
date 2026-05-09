class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
			return 0;

		int[] sorted = nums.clone();
		Arrays.sort(sorted);

		int longest = 1, current = 1;
		for (int i = 1; i < sorted.length; i++) {
			if (sorted[i] == sorted[i-1] + 1)
				current++;
			else if (sorted[i] != sorted[i-1])
				current = 1;

			longest = Math.max(longest, current);
		}

		return longest;
    }
}
