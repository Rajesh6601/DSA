public class reverseString {
    public static void main(String[] args) {
        String str =  "the    sky  is blue";
        String[] str1 = str.replaceAll("  "," ").split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= str1.length-1; i >=0; i--)
        {
            System.out.println(str1[i]);
            sb.append(str1[i] +" ");
        }
        System.out.println(sb.toString().trim());
    }
}
