package variant3;
import java.util.Scanner; // import the Scanner class 

public class upr1
{
    public static void main(String[] args){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter letter:");
            char letter = scanner.next().charAt(0);
            boolean bln;
            bln = Character.isLetter(letter);
            String answer = letter + " is a letter -->" + bln;
            System.out.println( answer );
    	}
    	
    
}
