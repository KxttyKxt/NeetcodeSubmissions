class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> balloonMap = new HashMap<>();
		for (char c : "balloon".toCharArray())
			balloonMap.put(c, balloonMap.getOrDefault(c, 0) + 1);

		Map<Character, Integer> textMap = new HashMap<>();
		for (char c : text.toCharArray())
			textMap.put(c, textMap.getOrDefault(c, 0) + 1);

		int maxNumberOfBalloons = text.length();

		for (char c : balloonMap.keySet())
			maxNumberOfBalloons = Math.min(maxNumberOfBalloons, textMap.getOrDefault(c, 0) / balloonMap.get(c));

		return maxNumberOfBalloons;
    }
}