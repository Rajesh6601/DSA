public class BuySTock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int buy = Integer.MAX_VALUE;
        int sell =0;
        for(Integer num : prices)
        {
            buy = Math.min(buy, num);
            sell = Math.max(sell, num-buy);
        }
        System.out.println("Selling Price:"+ sell);
    }
}
