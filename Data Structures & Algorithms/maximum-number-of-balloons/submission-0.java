class Solution {
    public int maxNumberOfBalloons(String text) {
        final char[] BALLOON = "balloon".toCharArray();
		int numBalloons = 0;

		while (true) {
			for (char c : BALLOON) {
				int charI = text.indexOf(c);

				if (charI == -1)
					return numBalloons;
				else
					text = text.substring(0, charI) + text.substring(charI + 1);
			}
			numBalloons++;
		}
    }
}