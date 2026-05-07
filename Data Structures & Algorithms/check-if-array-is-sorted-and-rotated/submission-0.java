class Solution {
    public boolean check(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sorted);

		if (Arrays.equals(nums, sorted))
			return true;

		int[] rotated = Arrays.copyOf(sorted, sorted.length);

		// for each possible rotation...
		for (int rot = 1; rot < nums.length; rot++) {
			// rotate once
			for (int i = 0; i < sorted.length; i++)
				rotated[(i+rot) % sorted.length] = sorted[i];
			// then check
			if (Arrays.equals(nums, rotated))
				return true;
		}

		return false;
    }
}