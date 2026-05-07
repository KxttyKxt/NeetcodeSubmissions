class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterElements = new int[nums1.length];
		Arrays.fill(nextGreaterElements, -1);

		for (int i = 0; i < nextGreaterElements.length; i++)
			for (int j = nums2.length - 1; j >= 0; j--)
				if (nums2[j] > nums1[i])
					nextGreaterElements[i] = nums2[j];
				else if (nums2[j] == nums1[i])
					break;

		return nextGreaterElements;
    }
}