package variant2;
import java.util.Scanner; // import the Scanner class 

public class upr1 {
    
    public static void main(String[] args){
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("Awaiting Input:");
        char input = scanner.next().charAt(0);
        boolean output;
        if( (input>= 'a' && input <= 'z') || (input>= 'A' && input<= 'Z')){
            output = true;
        }else{ output = false;}
        System.out.println( input + "--" +output  );
    }
    
}
