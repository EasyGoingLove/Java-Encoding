package variant3;
import java.util.Scanner; // import the Scanner class 

public class upr4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a substitution code (26 letters from the alphabet , no repeat of charecers , no symbols):");
        String subCode = scanner.next();
        //Example input XVSHJQEMZKTUIGAPOYLRWDCFBN
        //Example output OYWVGXNDMEJSHZQPFTCKLBUARI

        while (true) {
            if(validateString(subCode)){
              break;
            }else{System.out.println("Wrong input - Try Again:");}
            System.out.println("Enter a substitution code (26 letters from the alphabet , no repeat of charecers , no symbols):");
            subCode = scanner.next();
        }
        reverseCode(subCode.toLowerCase());
    }

    public static boolean validateString(String subCode) {
        subCode = subCode.toLowerCase();
        boolean checker1 = true , checker2 = true;
        char[] charArray = subCode.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           char ch = charArray[i];
           if ((ch >= 'a' && ch <= 'z')) {
              checker1 =  true;
           }else{checker1 = false;break;}
        }
        for (int i = 0; i < subCode.length(); i++) {
            for (int j = i + 1; j < subCode.length(); j++) {
                if (subCode.charAt(i) == subCode.charAt(j)) {
                    checker2 = false;break;
                }else{checker2 = true;}
            }
        }
        if(checker1==true && checker2 == true){
            return true;
        }else{return false;}
     }

     static void reverseCode(String subCode) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] reversed = new int[26];
        char output[] = new char[100];

        for (int i = 0; i < subCode.length(); i++) {
            for (int j = 0; j < subCode.length(); j++) {
                if(alphabet[i] == subCode.charAt(j)){
                    reversed[i] = j;
                }
            }
        }
        for (int i = 0; i < reversed.length; i++) {
            output[i] = alphabet[reversed[i]] ;
        }

        String outputString = String.valueOf(output);
        System.out.println(outputString.toUpperCase());
     }
}
