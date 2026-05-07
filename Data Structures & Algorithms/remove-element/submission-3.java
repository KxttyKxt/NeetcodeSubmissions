class Solution {
    /// Removes `val` from array `nums` **in-place**.
	/// 
	/// NeetCode and discussers often use a new list to track values from `nums` which are not `val`.
	/// I, however, have opted to actually run this in-place removal by mutating the original array.
	/// -1 indicates a removal because of the constraint "`0 <= nums\[i\] <= 50`"
	///
	/// @param nums the original array of values
	/// @param val  the value to remove
	///
	/// @return the length of the array after all occurrences of `val` in `nums` have been removed
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
        
		int indexToPullFromAfterRemoval = 0;
		int currentIndex = 0;

		// run in-place removal
		while (currentIndex < nums.length) {
			while (indexToPullFromAfterRemoval < nums.length && nums[indexToPullFromAfterRemoval] == val)
				indexToPullFromAfterRemoval++;

			if (indexToPullFromAfterRemoval >= nums.length)
				// replace elements beyond "new" array length with -1
				nums[currentIndex++] = -1;
			else
				nums[currentIndex++] = nums[indexToPullFromAfterRemoval++];
		}

		// return the length of the array up until the first -1 (removed) value is reached
		int lengthBeforeNegativeOne = Arrays.stream(nums).boxed().toList().indexOf(-1);
		return lengthBeforeNegativeOne == -1 ? nums.length : lengthBeforeNegativeOne;
	}
}