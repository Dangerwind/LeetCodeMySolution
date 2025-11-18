class Solution {
    public int threeSumClosest(int[] nums, int target) {
        var len = nums.length;
        var closeTarget = nums[0] + nums[1] + nums[2];

        for (int a = 0; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                for (int c = b + 1; c < len; c++) {
                
                    var maiBeTarget = nums[a] + nums[b] + nums[c];

                    if (a == b || b == c || c == a ) {
                        continue;
                    }

                     if ((Math.abs(target - maiBeTarget)) < Math.abs(target - closeTarget)) {
                         closeTarget = maiBeTarget;
                     }
                }
            }

        }

    return closeTarget;
    }
}
