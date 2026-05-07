class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterElements = new int[nums1.length];
		Arrays.fill(nextGreaterElements, -1);

		for (int i = 0; i < nextGreaterElements.length; i++) {
			int indexOfCurrentNum1InCurrentNum2 = nums2.length;
			for (int j = 0; j < nums2.length; j++)
				if (nums2[j] == nums1[i])
					indexOfCurrentNum1InCurrentNum2 = j;

			for (int j = indexOfCurrentNum1InCurrentNum2 + 1; j < nums2.length; j++) {
				if (nums2[j] > nums1[i]) {
					nextGreaterElements[i] = nums2[j];
					break;
				}
			}
		}

		return nextGreaterElements;
    }
}