class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();

        for(String word : strs)
        {
            char[] chars= word.toCharArray();
            Arrays.sort(chars);
            String store = new String(chars);

            if(!hash.containsKey(store))
                hash.put(store, new ArrayList<>());
            hash.get(store).add(word);
        }

        return new ArrayList<>(hash.values());
    }
}
    