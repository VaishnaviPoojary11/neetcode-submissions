class Solution {
    public int maxProfit(int[] p) {
        int m[]=new int[p.length];
        m[0]=p[0];
        int max=0;
        for(int i=1;i<p.length;i++){
            m[i]=Math.min(p[i],m[i-1]);
        }
        System.out.println(Arrays.toString(m));
        for(int i=1;i<p.length;i++){
            max=Math.max(max,(p[i]-m[i-1]));
        }
        return max;
    }
}
