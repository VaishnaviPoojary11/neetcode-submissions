class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> h1 = new HashMap<>();
         HashMap<Character,Integer> h2 = new HashMap<>();

        for(char x: s.toCharArray()){
            if (h1.containsKey(x)) {
                int i = h1.get(x);
                i++;
                h1.put(x, i);
            }else{
                h1.put(x, 1);
            }
        }
        for(char x: t.toCharArray()){
            if(h2.containsKey(x)){
                int i = h2.get(x);
                i++;
                h2.put(x, i);
            }else{
                h2.put(x, 1);
            }
        }

        if(h1.size()!=h2.size()){
            
            return false;
        }

        for(char x : h1.keySet()){
            if(!h2.containsKey(x)){
                return false;
            }
            else if(!h1.get(x).equals(h2.get(x))){
                return false;
            }
        }
        return true;
    }
}
