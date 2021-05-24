package Variant1;
import java.util.Scanner; // import the Scanner class 

public class upr4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an encoding String:");
        String encString = scanner.next();
        //Example input XVSHJQEMZKTUIGAPOYLRWDCFBN
        //Example output OYWVGXNDMEJSHZQPFTCKLBUARI

        loopRules(encString,scanner);
        codeRevursal(encString);
        

    }

    static void loopRules(String encString,Scanner scanner) {
        while (true) {
            if(onlyOneTime(encString)){
                System.out.println("Letters must not repeat in the input 'encoding String'");
               }
            else if(onlyLetters(encString)==false) {
                System.out.println("Encoding String must contain only letters and must be 26 letter long");
               }
            else{
                break;
            }
            System.out.println("Enter an encoding String:");
            encString = scanner.next();
        }
    }

    static boolean onlyOneTime(String input) {
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (Character.isLetter(letter) && input.indexOf(letter, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }

    static boolean onlyLetters(String stringTwo) {
        boolean checker = true;
        if (stringTwo.length()<26) {
            checker = false;
        }else{
        for (int i = 0; i < stringTwo.length(); i++){
            if( (stringTwo.charAt(i)>= 'a' && stringTwo.charAt(i) <= 'z') || (stringTwo.charAt(i)>= 'A' && stringTwo.charAt(i)<= 'Z')){
                checker = true;
            } else{
                checker = false;
                break;
            }
        }  
    }
        return checker;
    }
    static void codeRevursal(String encodingString) {
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
