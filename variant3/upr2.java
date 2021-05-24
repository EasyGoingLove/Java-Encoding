package variant3;
import java.util.Scanner; // import the Scanner class 

public class upr2 {
    public static void main(String[] args){
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.next();
        String message = "asd";

        for (int i = 0; i < string.length(); i++)
          {
            if(!Character.isLetter(string.charAt(i))){
                message = string + "is not a valid substitution code - FALSE";
                break;
            }else{message = string + "is a valid substitution code - TRUE"; }
          }
          System.out.println(message);
          
    }
    
}
