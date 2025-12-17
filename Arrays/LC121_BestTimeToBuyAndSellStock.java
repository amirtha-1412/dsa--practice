class Solution {
    public int maxProfit(int[] prices) {
        int m1=prices[0];
        int m2=0;
        for (int i=1;i<prices.length;i++) {
            if (prices[i]<m1) {
                m1=prices[i];
            } else {
                int profit=prices[i]-m1;
                m2=Math.max(m2,profit);
            }
        }
        return m2;
    }
}
