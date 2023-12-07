import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String str = "leetcode";
        char[] st = str.toCharArray();
        int i  =0;
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
//        for(String word : wordDict)
//        {
//            char[] ch1 = word.toCharArray();
//            while(i < st.length)
//            {
//                if(st[i] == ch1)
//            }
//
//        }
        System.out.println(wordDict);
    }
}
