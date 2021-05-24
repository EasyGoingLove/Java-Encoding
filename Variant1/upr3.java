package Variant1;
import java.util.Scanner; // import the Scanner class 

public class upr3 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to be encoded:");
        String stringOne = scanner.next();
        System.out.println("Enter an encoding String:");
        String stringTwo = scanner.next();
        // Example input : qwertyuiopasdfghjklzxcvbnm
        loopRules(stringTwo,scanner);
        solution(stringTwo,stringOne);

    }

    static void loopRules(String stringTwo,Scanner scanner) {
        while (true) {
            if(onlyOneTime(stringTwo)){
                System.out.println("Letters must not repeat in the input 'encoding String'");
               }
            else if(onlyLetters(stringTwo)==false) {
                System.out.println("Encoding String must contain only letters and must be 26 letter long");
               }
            else{
                break;
            }
            System.out.println("Enter an encoding String:");
            stringTwo = scanner.next();
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
    static void solution(String input_two, String input_one) {
        char[] ch  = input_one.toCharArray();
        int [] possition = new int[input_one.length()+1];
        int counter = 0;
        String finalString;
        char codedString[] = new char[50];

            for(char c : ch){
                int temp = (int)c;
                int temp_integer = 96; //for lower case
                if(temp<=122 & temp>=97)
                possition[counter] = temp-temp_integer - 1 ;
                counter++;
                
            }
            for (int i = 0; i < possition.length; i++) {
                codedString[i] = input_two.charAt(possition[i]);
            }

            finalString= String.valueOf(codedString);
            System.out.println(finalString.toUpperCase());
    }
}



