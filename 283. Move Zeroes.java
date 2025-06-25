class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 0) && (pointer == -1)) {
                pointer = i;
            }

            if ((nums[i] != 0) && (pointer != -1 )) {
                nums[pointer] = nums[i];
                nums[i] = 0;
                pointer++;
            }
        }
    }
}
