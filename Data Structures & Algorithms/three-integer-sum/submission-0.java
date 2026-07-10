class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> l = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    l.add(a);
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(l);
    }
}
