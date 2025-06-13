class Solution {
    public boolean isPalindrome(int x) {
        var stt1 = String.valueOf(x);
        String stt2 = new StringBuilder(stt1).reverse().toString();

        if(stt1.equals(stt2)) {
            return true;
        }
        return false;
    }
}
