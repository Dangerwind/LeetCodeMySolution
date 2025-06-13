class Solution {
    public List<String> letterCombinations(String digits) {

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            System.out.println(result);
            return result;
        }

        int[] index = new int[digits.length()]; // счётчики
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digits.length(); i++) {
                String letters = map.get(digits.charAt(i));
                sb.append(letters.charAt(index[i]));
            }
            result.add(sb.toString());
            
            int pos = digits.length() - 1;
            while (pos >= 0) {
                String letters = map.get(digits.charAt(pos));
                index[pos]++;
                if (index[pos] < letters.length()) {
                    break;
                } else {
                    index[pos] = 0;
                    pos--;
                }
            }

            if (pos < 0) break;
        }

        return result;

    }
}
