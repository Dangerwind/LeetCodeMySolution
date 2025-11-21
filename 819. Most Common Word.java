class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] mass = paragraph.toLowerCase().split("[ .,!?:;']");

        List<String> banList = Arrays.asList(banned);
        List<String> massList = Arrays.asList(mass);
        Map<String, Integer> mapa = new HashMap<>();


        for (String word : massList) {
            if (banList.contains(word) || word == "" || word == " ") {
                continue;
            }
            mapa.put(word, mapa.getOrDefault(word,0) + 1);
        }

        var ret = mapa.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null)
                .getKey();
        return ret;
    }
}
