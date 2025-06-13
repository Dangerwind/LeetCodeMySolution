class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

      Set<List<Integer>> retset = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2 ; i++) {
            var left = i + 1;
            var right = nums.length - 1;

            while(left < right) {

                var summ = nums[left] + nums[right] + nums[i];

                if (summ == 0) {
                    retset.add(Arrays.asList(nums[i], nums[left], nums[right]));
                }

                if (summ < 0 ) {
                    left++;
                } else {
                    right--;
                }

            }
            
        }

        return new ArrayList<>(retset);
    }
}
