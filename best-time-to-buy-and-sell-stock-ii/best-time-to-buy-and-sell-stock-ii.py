class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        size = len(prices)
        profit = 0
        
        for i in range(0, size-1):
            l = prices[i]
            r = prices[i+1]
            
            if (l >= r):
                l = l+1
                r = r+1
                
            elif (l < r):
                profit = profit + (r-l)
        
        return profit
                
            
        
        