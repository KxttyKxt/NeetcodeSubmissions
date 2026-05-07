class Solution {
    public int pivotIndex(int[] nums) {
        int sumFromLeft = 0, sumFromRight = Arrays.stream(nums).sum();

		for (int i = 0; i < nums.length; i++) {
			if (i > 0)
				sumFromLeft += nums[i-1];

			sumFromRight -= nums[i];

			if (sumFromLeft == sumFromRight)
				return i;
		}

		return -1;
    }
}