package Variant1;
import java.util.Scanner; // import the Scanner class 

public class upr2 {
    
    public static void main(String[] args){
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String :");
        String string = scanner.next();
        Integer tru = 0,fal = 0;
            for (int i = 0; i < string.length(); i++){
                if( (string.charAt(i)>= 'a' && string.charAt(i) <= 'z') || (string.charAt(i)>= 'A' && string.charAt(i)<= 'Z')){
                    tru++;
                }else{ fal++;}
            }
        if (fal> 0) {
            System.out.println(string + "not valid. Return False");
        }else{System.out.println(string + "not valid. Return True");}
        
    }
    

}
