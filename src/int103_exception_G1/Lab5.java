package int103_exception_G1;

public class Lab5  {
    public static void main(String[] args) {
       System.out.println("Main method call method doThis()");
       try{
           doThis();
       } 
       catch(Exception e){
           System.out.println("Main method receive exception " + e.getMessage());
       }}
    public static void doThis() throwsException {
        System.out.println("Method doThis() call method doThat()");doThat();
    }
    public static void doThat() throwsException {
        throw new Exception();
    }
}