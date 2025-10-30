class Solution {
    public int myAtoi(String s) {
        var newS = s.trim();
        char[] mass = newS.toCharArray();
        int start = 0;
        int sign = 1;
        int oldR = 0;

        int resnum = 0;

        if (newS.length() == 0) return 0;

        if (mass[0] == '-') { 
            sign = -1;
            start = 1;
        }
        
        if (mass[0] == '+') {
            start = 1;
        }
        
        for (int i = start; i < newS.length(); i++) {
            int nnn = mass[i] - '0';
            if ((nnn >= 0) & (nnn <= 9)) {
                oldR = resnum;
                resnum = resnum * 10 + nnn;

                if (resnum/10 < oldR) {
                    if (sign > 0) return 2147483647;
                    else {
                        return -2147483648;
                    }
                }
            }
            else {
                break;
            }
        }
        return resnum * sign;
    }
}
