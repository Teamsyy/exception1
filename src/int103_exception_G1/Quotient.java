package int103_exception_G1;
import java.util.Scanner;

public class Quotient{

    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
        System.out.println("Enter two integers");
        
       int value1 = x.nextInt();
       int value2 = x.nextInt();
       try {
        System.out.println(value1 + " / " + value2 + " = "  + (value1 / value2));
       }
       catch (ArithmeticException e){
            System.out.println("Exception : Divisor cannot be zezo");
       
    }
    }
}
