public class STringOperation {
    public static void main(String[] args) {
        String str= "aeiOUz";
        str = str.concat(str);
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i=0; i<n ;i++)
        {
            char ch = str.charAt(i);
            int asciivalue = (int) ch ;
            if(!(asciivalue >= 65 && asciivalue <=90))
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        String st = new String(sb.toString());
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i < st.length(); i++)
        {
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                sb1.append('#');
            }
            else {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);
    }
}
