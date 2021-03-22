public class Exc_throw_Sid {
    void vote(int age) {
        if (age < 18) {
            throw new ArithmeticException("not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String [] args){
        Exc_throw_Sid s = new Exc_throw_Sid();
        s.vote(12);
    }
}
