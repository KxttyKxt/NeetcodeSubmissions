class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>(nums.length);
		for (int item : nums) {
			if (numsSet.contains(item))
				return true;
			else
				numsSet.add(item);
		}
		return false;
    }
}