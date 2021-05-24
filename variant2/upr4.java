package variant2;
import java.util.Scanner; // import the Scanner class 

public class upr4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a substitution code:");
        String encodingString = scanner.next();
        //Example input XVSHJQEMZKTUIGAPOYLRWDCFBN
        //Example output OYWVGXNDMEJSHZQPFTCKLBUARI
        correctInputLoop(encodingString,scanner);
        reverseCode(encodingString);

    }
    static void correctInputLoop(String encodingString,Scanner scanner) {
        while (true) {
            if(checkForRepeat(encodingString)){
                System.out.println("Letters must not repeat in the input 'encoding String'");
               }
            else if(checkForLetter(encodingString)==false) {
                System.out.println("Encoding String must contain only letters and must be 26 letter long");
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
        if (encoderString.length()<26) {
            checker = false;
        }else{
        for (int i = 0; i < encoderString.length(); i++){
            if( (encoderString.charAt(i)>= 'a' && encoderString.charAt(i) <= 'z') || (encoderString.charAt(i)>= 'A' && encoderString.charAt(i)<= 'Z')){
                checker = true;
            } else{
                checker = false;
                break;
            }
        }  
    }
        return checker;
   }
   static void reverseCode(String encodingString) {
    char alphabet[] = new char[26];
    int[] correctPositions = new int[26];
    char output[] = new char[100];
    int arrayCounter = 0;

    for(char c = 'a'; c <= 'z'; c++){
        alphabet[arrayCounter] = c;
        arrayCounter++;
     }

    for (int i = 0; i < encodingString.length(); i++) {
        for (int j = 0; j < encodingString.length(); j++) {
            if(alphabet[i] == encodingString.charAt(j)){
                correctPositions[i] = j;
            }
        }
    }
    for (int i = 0; i < correctPositions.length; i++) {
        output[i] = alphabet[correctPositions[i]] ;
    }

    String outputString = String.valueOf(output);
    System.out.println(outputString.toUpperCase());
 }
    
}
