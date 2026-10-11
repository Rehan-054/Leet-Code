class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int x = 0;
            if(n%(i+1) == 0){                
                x += nums[i] * nums[i];
            }
            sum += x;
        }
        return sum;
    }
}