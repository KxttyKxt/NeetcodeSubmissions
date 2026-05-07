class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1IndexesMap = new HashMap<>();
		for (int i = 0; i < nums1.length; i++)
			nums1IndexesMap.put (nums1[i], i);

		int[] nextGreaterElements = new int[nums1.length];
		Arrays.fill(nextGreaterElements, -1);

		Stack<Integer> stack = new Stack<>();
		for (int num : nums2) {
			while (!stack.isEmpty() && num > stack.peek()) {
				int stackValue = stack.pop();
				int index = nums1IndexesMap.get(stackValue);
				nextGreaterElements[index] = num;
			}
			if (nums1IndexesMap.containsKey(num)) {
				stack.push(num);
			}
		}

		return nextGreaterElements;
    }
}