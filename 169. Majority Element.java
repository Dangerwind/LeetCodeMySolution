class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (var nnn : nums) {
            if (mapa.containsKey(nnn)) {
                mapa.put(nnn, mapa.get(nnn) + 1);
            } else {
                mapa.put(nnn, 1);
            }
        }

        return mapa.entrySet().stream()
                .max((data1, data2) -> Integer.compare(data1.getValue(), data2.getValue()))
                .get()
                .getKey();
    }
}
