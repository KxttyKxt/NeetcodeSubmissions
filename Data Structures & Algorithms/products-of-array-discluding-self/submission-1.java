class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int N = nums.length;
        int[] products = new int[N];

        products[0] = 1;
        for (int i = 1; i < N; i++)
            products[i] = products[i-1] * nums[i-1];
        
        int postfix = 1;
        for (int i = N - 1; i >= 0; i--) {
            products[i] *= postfix;
            postfix *= nums[i];
        }
        
        return products;
    }
}  
