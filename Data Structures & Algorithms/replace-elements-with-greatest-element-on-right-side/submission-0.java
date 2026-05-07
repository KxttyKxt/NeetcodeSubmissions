class Solution {
    public int[] replaceElements(int[] arr) {
		int[] toReturn = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			toReturn[i] = Arrays.stream(Arrays.copyOfRange(arr, i + 1, arr.length)).max().orElse(-1);

		return toReturn;
    }
}