class NumArray {

    private int[] intNum;

    public  NumArray(int[] nums) {
        intNum = new int[nums.length + 1]; 

        for (var i = 0; i < nums.length; i++)
        {
            intNum[i+1] = intNum[i] + nums[i];
           
        }           
    }
    
    public int sumRange(int left, int right) {
        return intNum[right+1] - intNum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
