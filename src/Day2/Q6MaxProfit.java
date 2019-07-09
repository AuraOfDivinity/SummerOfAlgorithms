package Day2;

public class Q6MaxProfit {
    public static void main(String[] args) {
        int [] prices = {7, 1, 4, 5, 6};

        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                buy = prices[i];
                sell = prices[j];
                if(maxProfit < (sell - buy)){
                    maxProfit = (sell - buy);
                }
            }
        }

        return maxProfit;
    }
}
