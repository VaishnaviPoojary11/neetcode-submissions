class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(Integer x : nums){
            if(h.contains(x)){
                return true;
            }
            else{
                h.add(x);
            }
        }
        return false;
    }
}