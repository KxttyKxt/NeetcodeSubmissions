class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int N = nums.length;

        int[] productExceptSelf = new int[N];
        Arrays.fill(productExceptSelf, 1);

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (j != i)
                    productExceptSelf[j] *= nums[i];
        
        return productExceptSelf;
    }
}  
