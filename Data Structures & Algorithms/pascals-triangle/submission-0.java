class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascalsTriangle = new int[numRows][];

		for (int row = 0; row < numRows; row++) {
			pascalsTriangle[row] = new int[row + 1];

			for (int i = 0; i <= row; i++)
				if (i == 0 || i == row)
					pascalsTriangle[row][i] = 1;
				else
					pascalsTriangle[row][i] = pascalsTriangle[row - 1][i - 1] + pascalsTriangle[row - 1][i];
		}

		List<List<Integer>> pascalsList = new ArrayList<>(pascalsTriangle.length);
		for (int[] row : pascalsTriangle)
			pascalsList.add(Arrays.stream(row).boxed().toList());
		return pascalsList;
    }
}