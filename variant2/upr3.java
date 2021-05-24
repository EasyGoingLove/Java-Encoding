package variant2;
import java.util.Scanner; // import the Scanner class 

public class upr3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to be encoded:");
        String encodedString = scanner.next();
        System.out.println("Enter an encoding String:");
        String encodingString = scanner.next();
        
        correctInputLoop(encodingString,scanner);

        
        
        
        

    }
    static void correctInputLoop(String encodingString,Scanner scanner) {
        while (true) {
            if(checkForRepeat(encodingString)){
                System.out.println("Letters must not repeat in the input 'encoding String'");
               }
            else if(checkForLetter(encodingString)==false) {
                System.out.println("Encoding String must contain only letters");
               }
            else{
                break;
            }
            System.out.println("Enter an encoding String:");
            encodingString = scanner.next();
        }
    }

    static boolean checkForRepeat(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && input.indexOf(ch, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }

    static boolean checkForLetter(String encoderString) {
        boolean checker = true;
        for (int i = 0; i < encoderString.length(); i++){
            if( (encoderString.charAt(i)>= 'a' && encoderString.charAt(i) <= 'z') || (encoderString.charAt(i)>= 'A' && encoderString.charAt(i)<= 'Z')){
                checker = true;
            } else{
                checker = false;
                break;
            }
        }  
        return checker;
    }
    
}
