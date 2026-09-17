class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    nums.add(arr2[i]);
                    break;
                }
            }
        }
        int[] arr = new int[nums.size()];
        int k = 0;
        for(int x : nums){
            arr[k++] = x;
        }
        return arr;
    }
}