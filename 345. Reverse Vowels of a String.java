class Solution {
    public String reverseVowels(String s) {
        String testLetter = "aeiou";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (testLetter.indexOf(Character.toLowerCase(chars[left])) == -1) {
                left++;
                continue;
            }
            if (testLetter.indexOf(Character.toLowerCase(chars[right])) == -1) {
                right--;
                continue;
            }
                char tempCh = chars[left];
                chars[left] = chars[right];
                chars[right] = tempCh;
                left++;
                right--;

        }

        return new String(chars);
    
    }
}
