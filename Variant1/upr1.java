package Variant1;
import java.util.Scanner; // import the Scanner class 

public class upr1
{
    public static void main(String[] args){
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter charrecter:");
            char charrecter = scanner.next().charAt(0);

            chekACodeChar(charrecter);
    	}
    	
    	   static void chekACodeChar(char c) {
           if( (c>= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z'))
              {System.out.println(c + " is valid.");itIsTrue();}
            else
              { System.out.println(c + " is invalid.");itIsFalse();}
        
           }

           static boolean itIsTrue(){
                   return true;
           }
           static boolean itIsFalse(){
                return false;
           }

        
}
