class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i] > max) max = nums[i];
        }
        int count = 0;
        for(int i=0; i<n; i++){
            int dif =Math.abs(max - nums[i]);
            count += dif;
        }
        return count;
    }
}