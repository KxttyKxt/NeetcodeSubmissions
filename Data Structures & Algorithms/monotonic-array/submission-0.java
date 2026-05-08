class Solution {
    public boolean isMonotonic(int[] nums) {
		boolean increasing = false, decreasing = false;

		for (int i = 1; i < nums.length; i++) {
			if (!increasing && !decreasing) {
				if (nums[i - 1] < nums[i])
					increasing = true;
				else if (nums[i - 1] > nums[i])
					decreasing = true;
			} else if ((increasing && nums[i - 1] > nums[i]) || (decreasing && nums[i - 1] < nums[i])) {
				return false;
			}
		}

		return true;
    }
}