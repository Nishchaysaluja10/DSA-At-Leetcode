class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // for(int i=0;i<prices.length-1;i++){
        //     int left=i+1;
        //     // System.out.println("left Initial = "+left);
        //     while(left<prices.length){
        //         if(prices[left]-prices[i]>profit){
        //             profit=prices[left]-prices[i];
        //             // System.out.println("left="+prices[left]+"right="+prices[i]);
        //         }
        //         while(left<prices.length-1 && prices[left]==prices[left+1]){
        //         left++;
        //         }
        //         // System.out.println(left);
        //         left++;
        //     }
        // }
        // return profit;
        int profit = 0 ;
        int min = prices[0] ;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)min=prices[i];
            if(prices[i]-min>profit)profit=prices[i]-min;
        }
        return profit;
    }
}