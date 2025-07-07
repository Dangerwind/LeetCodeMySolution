class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ret = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber = columnNumber -1;
            ret.insert(0, (char) (((columnNumber) % 26) + 'A'));
            columnNumber /= 26;
        }
        return ret.toString();
    }
}
