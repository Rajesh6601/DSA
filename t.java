import java.util.Scanner;

public class t {
    public static void solve(String s){
        if(s.length() == 0){
            return;
        }
        solve(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        solve(str);
    }
}
