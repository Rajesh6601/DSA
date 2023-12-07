public class Rectangle {
    public static int[] generateRectangle(int area)
    {
        int sqrt = (int)Math.sqrt(area);
        if( sqrt * sqrt == area)
        {
            return new int[] {sqrt,sqrt};
        }
        int[] ans = new int[2];
        return rectangle(area, ans , sqrt);

    }
    public static int[] rectangle(int area, int[] ans, int sqrt)
    {
        if(area % sqrt ==0)
        {
            ans[0] = area/sqrt;
            ans[1] = sqrt;
            return ans;
        }
        return rectangle(area, ans, sqrt-1);
    }
    public static void main(String[] args) {
        int num = 36;
        int [] result = generateRectangle(num);
        System.out.println(result[0] + "," + result[1]);

    }
}
