//brute force O(n^2)
public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = -1;
        for(int i = 0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int p = prices[j] - prices[i];
                if(p > max){
                    max = p;
                }
            }
        }
        if(max < 0) return 0;
        return max;
    }
        
//kadane's O(n)
public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0], profit = -1;
        
        for(int i = 0; i<n; i++){
            if(prices[i]< min){
                min = prices[i];
            }
            int dif = prices[i] - min;
            if(profit < dif) profit = dif;
        }
        return (profit < 0)? 0 : profit;
    }
