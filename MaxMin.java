class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        int i;
        for(i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }

        for(int j=0; j<nums.length; j++){
            arr[i + j] = nums[j];
        }
        return arr;
    }
}