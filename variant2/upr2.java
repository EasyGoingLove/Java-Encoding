package variant2;
import java.util.Scanner; // import the Scanner class 

public class upr2 {
    public static void main(String[] args){
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter charecters:");
        String charecters = scanner.next();
        boolean output = true;
            for (int i = 0; i < charecters.length(); i++){
                if( (charecters.charAt(i)>= 'a' && charecters.charAt(i) <= 'z') || (charecters.charAt(i)>= 'A' && charecters.charAt(i)<= 'Z')){
                    output = true;
                }else{ output = false;}
            }
        System.out.println( charecters + "--" + output );
    }
    
}