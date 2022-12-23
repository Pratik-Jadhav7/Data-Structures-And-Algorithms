​profit1[i] = max profit on day i if I sell

profit2[i] = max profit on day i if I do nothing
How will those profits on day i+1 relate to profits on day i ?

1. profit1[i+1] means I must sell on day i+1, and there are 2 cases:

a. If I just sold on day i, then I have to buy again on day i and sell on day i+1

b. If I did nothing on day i, then I have to buy today and sell today 

Taking both cases into account, profit1[i+1] = max(profit1[i]+prices[i+1]-prices[i], profit2[i])

2. profit2[i+1] means I do nothing on day i+1, so it will be max(profit1[i], profit2[i])
And the code:




    public int maxProfit(int[] prices) { 
    int profit1=0, profit2=0;   
    for(int i=1; i<prices.length; i++){
        int copy=profit1;
        profit1=Math.max(profit1+prices[i]-prices[i-1], profit2);
        profit2=Math.max(copy, profit2);
    }
    return Math.max(profit1, profit2);
}
