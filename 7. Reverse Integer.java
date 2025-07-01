class Solution {
    public static int reverse(int x) {

        int oldI = 0;
        boolean negative = x < 0;
        if (x < 0) {
            x = -x;
        }
        int newInt = 0;
        while (x > 0) {
            int oneData = x % 10;
            var ildI = newInt;
            newInt = newInt * 10 + oneData;
            if (ildI != newInt / 10) {
                return 0;
            }
            x = x / 10;
        }
        return negative ? -newInt : newInt;
    }
}
