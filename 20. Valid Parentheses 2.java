class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int i = -1;
      
        for(char c: s.toCharArray()) {
          
            if(c == '(') {
              i++;
              stack[i] = ')';
            } else if(c == '{') {
              i++;
              stack[i] = '}';
            } else if(c == '[') {
              i++;
              stack[i] = ']';
            } else if(i < 0 || stack[i--] != c) {
              return false;
            }
          
        }
        return i == -1;
    }
}
