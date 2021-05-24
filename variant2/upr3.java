package variant2;
import java.util.Scanner; // import the Scanner class 

public class upr3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to be encoded:");
        String encodedString = scanner.next();
        System.out.println("Enter an encoding String:");
        String encodingString = scanner.next();
        // Example input : zaqxswcdevfrbgtnhymjukilop
        correctInputLoop(encodingString,scanner);
        solution(encodingString.toLowerCase(),encodedString.toLowerCase());

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
    static void solution(String encodingString, String encodedString) {
        int alphabetPossition = 1;
        char alphabet[] = new char[26];
        int array[] = new int[encodedString.length()];
        int arrayCounter = 0;
        char codedMsg[] = new char[100];

        for(char c = 'a'; c <= 'z'; c++){
           alphabet[arrayCounter] = c;
           arrayCounter++;
        }
        arrayCounter=0;

        for (int i = 0; i < encodedString.length(); i++) {
            for (int v = 0; v < alphabet.length; v++) {
                if (encodedString.charAt(i) == alphabet[v]) {
                    array[arrayCounter] = v;
                    arrayCounter++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int v = 0; v < encodingString.length(); v++) {
                if(array[i] == v){
                    codedMsg[i] =encodingString.charAt(v);
                }
          }
        }
        String str = String.valueOf(codedMsg);
        System.out.println(str.toUpperCase());
    }
}

