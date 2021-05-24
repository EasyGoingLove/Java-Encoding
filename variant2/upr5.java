package variant2;
import java.util.Scanner; // import the Scanner class 
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class upr5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();

        while(true){
            if(!validtaeString(str)){
                System.out.println("Try Again!");
                System.out.println("Enter a string:");
                str = scanner.next();
            }else{
                break;
            }
        }
        System.out.println(frequencyMethod(str));
    }



    public static boolean validtaeString(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           char ch = charArray[i];
           if (!(ch >= 'a' && ch <= 'z')) {
              return false;
           }
        }
        return true;
     }

    public static String frequencyMethod(String s) {
 
        Map<Character, Integer> charCountMap = new HashMap<>();

          for(int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
          }
          PriorityQueue<Character> pq = 
            new PriorityQueue<Character>((a, b) -> charCountMap.get(b) - charCountMap.get(a));
         pq.addAll(charCountMap.keySet());
         StringBuilder sb = new StringBuilder();
         while(!pq.isEmpty()) {
             char c = pq.remove();
    
             for(int i = 0; i < 1; i++) {
                 sb.append(c);
              }
          }
           return sb.toString();
      }
}
