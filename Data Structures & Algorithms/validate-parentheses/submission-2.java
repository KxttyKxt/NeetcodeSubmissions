class Solution {
    private static final Map<Character, Character> parMap = Map.of(
			')', '(',
			']', '[',
			'}', '{'
	);

    public boolean isValid(String s) {
        Stack<Character> parStack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{')
				parStack.push(c);
			else if (parStack.isEmpty() || parStack.pop() != parMap.get(c))
				return false;
		}

		return parStack.isEmpty();
    }
}
