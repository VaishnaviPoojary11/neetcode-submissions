class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
            int ans[]=new int[2];
            
            int j=0;
            int k =numbers.length-1;
            while(j<k){
                if(numbers[j]+numbers[k]==target){
                    ans[0]=j+1;
                    ans[1]=k+1;
                    return ans;
                }
                else if(numbers[j]+numbers[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        return ans;
    }
}
