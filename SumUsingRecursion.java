public class SumUsingRecursion {
    public static void sumUsingRecursion(int num, int sum)
    {
        if(num ==0)
        {
            System.out.println("Sum :" +  sum);
        }

        if(num > 0)
        {
            sum += num%10;
            System.out.println(sum);
            sumUsingRecursion(num /10, sum);
        }

    }
    public static void main(String[] args) {

        int num = 12345;
        int sum =0;
        sumUsingRecursion(num,0);
    }
}
