class Solution {
    public boolean check(int[] nums) {
        int count = 0, len = nums.length;

		for (int i = 0; i < len; i++ )
			// if the current number is larger than the next (which isn't true in a sorted array),
			// and then if this has happened more than once (just once can indicate a rotation)...
			if (nums[i] > nums[(i + 1) % len] && ++count > 1)
				// abort, it's not sorted
				return false;
		
		return true;
    }
}