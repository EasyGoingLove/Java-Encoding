package variant3;
import java.util.Scanner; // import the Scanner class 
import java.util.HashMap;
import java.util.Map;


public class upr5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.next();
            while(true){
                if(LetterValidation(string)){
                    break;
                }else{
                    System.out.println("Wrong input!");
                    System.out.println("Enter a string:");
                    string = scanner.next();
                }
            }
            System.out.println(frequencySort(string));



    }
    static boolean LetterValidation(String string) {
        boolean checker = true;
        for (int i = 0; i < string.length(); i++){
            if( (string.charAt(i)>= 'a' && string.charAt(i) <= 'z') || (string.charAt(i)>= 'A' && string.charAt(i)<= 'Z')){
                checker = true;
            } else{
                checker = false;
                break;
            }
        }  
        return checker;
    }

    public static String frequencySort(String s) {
 
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();

        int len = s.length();
         for(int i = 0; i < len; i++) {
              char ch = s.charAt(i);
              charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
         }
         charCountMap.entrySet().stream()
                     .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                    .forEach(record -> {
                       Character key = record.getKey();
                       for(int i = 0; i < 1; i++) {
                             sb.append(key);
                        }
           });
           return sb.toString();
   }
  
}
