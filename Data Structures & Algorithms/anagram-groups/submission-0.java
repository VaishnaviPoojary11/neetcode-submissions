class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h = new HashMap<>();
        for(String x : strs){
            char ch[] = x.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(h.containsKey(key)){
                h.get(key).add(x);
            }
            else{
                ArrayList<String> a = new ArrayList<>();
                a.add(x);
                h.put(key,a);
            }
        }
        return new ArrayList<>(h.values());
    }
}
