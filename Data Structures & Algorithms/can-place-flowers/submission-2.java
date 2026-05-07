class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
			return true;

		// a deep copy preserves the original flowerbed when mutating below
		int[] flowerbedCopy = Arrays.copyOf(flowerbed, flowerbed.length);
		int placeableFlowers = 0;

		for (int i = 0; i < flowerbedCopy.length; i++) {
			if (flowerbedCopy[i] != 0)
				continue;

			boolean canPlaceFlowerAtI = true;

			if (i >= 1)
				canPlaceFlowerAtI = flowerbedCopy[i - 1] == 0;
			if (i < flowerbedCopy.length - 1)
				canPlaceFlowerAtI = canPlaceFlowerAtI && flowerbedCopy[i + 1] == 0;

			if (canPlaceFlowerAtI) {
				placeableFlowers++;
				flowerbedCopy[i] = 1;
			}
			
			if (placeableFlowers >= n)
				return true;
		}

		return false;
    }
}