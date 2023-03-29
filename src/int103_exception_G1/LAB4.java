package int103_exception_G1;

public class LAB4  {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(1/0);
            System.out.println("Statement 3");
        }
        
        catch(ArrayIndexOutOfBoundsException e){
        }
        catch (ArithmeticException e){
            throw new StringIndexOutOfBoundsException();
        }
        finally{
             System.out.println("Statement 4");
         }
         System.out.println("Statement 5");
    }  
}
