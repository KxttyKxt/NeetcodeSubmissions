class Solution {
    public int[] replaceElements(int[] arr) {
		int rightMax = -1;
		int[] toReturn = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			toReturn[i] = rightMax;
			rightMax = Math.max(arr[i], rightMax);
		}

		return toReturn;
    }
}