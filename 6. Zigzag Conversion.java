class Solution {
    public String convert(String s, int numRows) {

        char[] mass = s.toCharArray();
        int steper = 2 * numRows - 2;

        String result = new String("");
        var max = s.length();

        if ( numRows == 1) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {

            int pointer = i;

            while (pointer < max) {
                result = result + (mass[pointer]);

                if ((i != 0) & (i< numRows-1)) {
                    var stt = pointer + steper - i * 2;
                    if (stt< max) {
                        result = result + (mass[stt]);
                    }
                }
                pointer += steper;
            }
        }
        return result.toString();
    }
}
