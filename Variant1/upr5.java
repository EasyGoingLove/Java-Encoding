package Variant1;
import java.util.Scanner; // import the Scanner class 
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class upr5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();

        while(true){
            if(!checker(str)){
                System.out.println("Input from the user is invalid.");
                System.out.println("Enter a string:");
                str = scanner.next();
            }else{
                break;
            }
        }
        System.out.println(sortChar(str));
    }

    public static boolean checker(String name) {
        return name.matches("[a-zA-Z]+");
    }

        public static String sortChar(String s) {
     
            int n = s.length();
            StringBuilder res = new StringBuilder();
            Map<Character, Integer> charCount = new HashMap<>();
     
            int maxFreq = 0;
            int freq = 0;
     
            for(int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               freq = charCount.getOrDefault(ch, 0)+1;
               charCount.put(ch, freq);            
                maxFreq = Math.max(freq,maxFreq);        
            }
           List<Character>[] chArr = new List[maxFreq + 1];
    
          for(char ch : charCount.keySet()) {
             int num = charCount.get(ch);
             if(chArr[num] == null) {
               chArr[num] = new ArrayList<>();
             }
             chArr[num].add(ch);
          }
           for(int i = chArr.length-1; i >=0; i--) {
              if(chArr[i]!=null){
                 res.append(chArr[i]);  
              }
           }
           return res.toString();
      }
}
