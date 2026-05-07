class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longestMonotonic = 1;

		int longestIncreasingRun = 1;
		int longestDecreasingRun = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] < nums[i]) {
				longestIncreasingRun++;
				longestDecreasingRun = 1;
			}
			else if (nums[i-1] > nums[i]) {
				longestDecreasingRun++;
				longestIncreasingRun = 1;
			}
			else {
				longestIncreasingRun = 1;
				longestDecreasingRun = 1;
			}

			longestMonotonic = Math.max(longestMonotonic, Math.max(longestIncreasingRun, longestDecreasingRun));
		}

		return longestMonotonic;
    }
}