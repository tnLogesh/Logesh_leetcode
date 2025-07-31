class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2)return 0;
        int ptr1=0;
        int ptr2=1;
        int max=0;
        while(ptr2<n){
            if(prices[ptr1]<prices[ptr2]){
                int pro=prices[ptr2]-prices[ptr1];
                if(max<pro)max=pro;
                ptr2++;
                continue;
            }
            ptr1=ptr2;
            ptr2++;
        }
        return max;
    }
}