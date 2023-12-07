public class BuySellStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,5,4,3,2,1};
        int buy = Integer.MAX_VALUE;
        int sell =0;
        for(int i=0;i<prices.length;i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        System.out.println("Best Selling Price:" + sell);
    }
}
