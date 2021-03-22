public class Exc_hand_Sid {
    public static void main(String [] args){
        try{
            System.out.println("Hello");
            System.exit(0);
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(10/0);
            System.out.println("Exception raised");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
