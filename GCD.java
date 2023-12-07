public class GCD {
    public static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        if (b ==0)
            return a;
        if (a > b)
            return gcd(b, a%b);
        else
            return gcd(a, b%a);
    }
    public static void main(String[] args) {
        int a =16, b =20;
        System.out.println(gcd(a, b));
    }
}
