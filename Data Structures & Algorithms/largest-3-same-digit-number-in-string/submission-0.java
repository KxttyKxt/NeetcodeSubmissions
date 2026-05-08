class Solution {
    public String largestGoodInteger(String num) {
        SortedSet<Character> goodIntegers = new TreeSet<>();

		for (int i = 2; i < num.length();) {
			if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
				goodIntegers.add(num.charAt(i));
				i += 2;
			}
			i++;
		}

		return goodIntegers.isEmpty() ? "" : goodIntegers.getLast().toString().repeat(3);
    }
}