import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Balloon {
    public static void main(String[] args) {
        String str = "nlaebalko";
//        Set<Character> set = new HashSet<>();
//        int min = Integer.MAX_VALUE;
//        for(int i =0 ; i < str.length(); i ++)
//        {
//            set.add(str.charAt(i));
//        }
//        System.out.println(set);
//        Map<Character,Integer> map = new HashMap<>();
//        for(int i =0 ; i < str.length(); i ++)
//        {
//            if(set.contains(str.charAt(i)))
//            {
//                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//            }
//        }
//        if (map.size() < 5) return ;
//        System.out.println(map);
//        for(Map.Entry<Character, Integer> input : map.entrySet())
//        {
//             char key = input.getKey();
//             int value = input.getValue();
//             if (key == 'l' || key == 'o')
//             {
//                min = Math.min(min, (int)Math.floor(value/2));
//             }
//             else
//             {
//                 min = Math.min(min, value);
//             }
//        }
//        System.out.println("Occurence: "+ min);
//    }
//}
        Set<Character> map =  new HashSet();
        // declare our word balloon
        String text = "balloon";
        // iterate over balloon word:
        for(int i = 0; i < text.length(); i++) {
            // store each character in HashSet
            map.add(text.charAt(i));
        }
        // declare HashMap to calculate count
        Map<Character, Integer> hash = new HashMap();
        // iterate over text string:
        for(int i = 0; i < text.length(); i ++) {
            // get char from string
            char word = text.charAt(i);
            // if HashSet contains char:
            if(map.contains(word)) {
                // count char in HashMap
                hash.put(word, hash.getOrDefault(word, 0) + 1);
            }
        }
        // declare min variable to store answer
        int min = Integer.MAX_VALUE;
        // check if hash have all chars to make balloon word, if no return 0
        if(hash.size() < 5) return ;
        // iterate over HashMap:
        for(Map.Entry<Character, Integer> entry: hash.entrySet()) {
            // get char from HashMap
            char word = entry.getKey();
            // get count of char from HashMap
            int count = entry.getValue();
            // check if char is "l" or "o":
            if(word == 'l' || word == 'o') {
                // if true: set min as devision of count by 2 and floor it
                min = Math.min(min, (int)Math.floor(count / 2));
            } else {
                // if false: set min as min value of min or count
                min = Math.min(min, count);
            }
        }
        // return answer
        System.out.println("Occurence: "+ min);
    }
}
