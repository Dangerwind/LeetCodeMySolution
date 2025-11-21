class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
