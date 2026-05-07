class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>(numRows);

		for (int row = 0; row < numRows; row++) {
			pascalsTriangle.add(new ArrayList<>(row + 1));

			for (int i = 0; i <= row; i++)
				if (i == 0 || i == row)
					pascalsTriangle.get(row).add(1);
				else
					pascalsTriangle.get(row).add(
                        pascalsTriangle.get(row - 1).get(i - 1) + pascalsTriangle.get(row - 1).get(i));
		}

		return pascalsTriangle;
    }
}