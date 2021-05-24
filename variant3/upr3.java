package variant3;
import java.util.Scanner; // import the Scanner class 

public class upr3 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to be encoded:");
        String input_one = scanner.next();
        System.out.println("Enter an encoding String:");
        String input_two = scanner.next();
        // Example input : sdfaghjklzxcvbnmpoiuytrewq
        inputValidation(input_two,scanner);
        solution(input_two.toLowerCase(),input_one.toLowerCase());

    }

    static void inputValidation(String input_two,Scanner scanner) {
        while (true) {
            if(repeatValidation(input_two)){
                System.out.println("Letters must not repeat in the input 'encoding String'");
               }
            else if(LetterValidation(input_two)==false) {
                System.out.println("Encoding String must contain only letters and must be 26 letter long");
               }
            else{
                break;
            }
            System.out.println("Enter an encoding String:");
            input_two = scanner.next();
        }
    }

    static boolean repeatValidation(String input) {
        for (int i = 0; i < input.length(); i++) {
            char charr = input.charAt(i);
            if (Character.isLetter(charr) && input.indexOf(charr, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }

    static boolean LetterValidation(String input_two) {
        boolean checker = true;
        if (input_two.length()<26) {
            checker = false;
        }else{
        for (int i = 0; i < input_two.length(); i++){
            if( (input_two.charAt(i)>= 'a' && input_two.charAt(i) <= 'z') || (input_two.charAt(i)>= 'A' && input_two.charAt(i)<= 'Z')){
                checker = true;
            } else{
                checker = false;
                break;
            }
        }  
    }
        return checker;
    }
    static void solution(String input_two, String input_one) {
        int alphabetPossition = 1;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int arrayForPossition[] = new int[input_one.length()];
        int arrayCounter = 0;
        char output[] = new char[100];

        for (int i = 0; i < input_one.length(); i++) {
            for (int r = 0; r < alphabet.length; r++) {
                if (input_one.charAt(i) == alphabet[r]) {
                    arrayForPossition[arrayCounter] = r;
                    arrayCounter++;
                }
            }
        }
        for (int i = 0; i < arrayForPossition.length; i++) {
            for (int v = 0; v < input_two.length(); v++) {
                if(arrayForPossition[i] == v){
                    output[i] =input_two.charAt(v);
                }
          }
        }
        String outputString = String.valueOf(output);
        System.out.println(outputString.toUpperCase());
    }
}


