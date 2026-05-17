class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str: strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);

            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
