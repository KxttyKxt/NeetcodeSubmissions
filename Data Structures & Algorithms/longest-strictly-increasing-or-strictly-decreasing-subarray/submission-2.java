class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longestMono = 1, increasing = 1, decreasing = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] < nums[i]) {
				increasing++;
				decreasing = 1;
			}
			else if (nums[i-1] > nums[i]) {
				decreasing++;
				increasing = 1;
			}
			else {
				increasing = decreasing = 1;
			}
			longestMono = Math.max(longestMono, Math.max(increasing, decreasing));
		}

		return longestMono;
    }
}