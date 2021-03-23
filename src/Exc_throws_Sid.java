import java.io.IOException;

public class Exc_throws_Sid {
    void m3() throws IOException{
        throw new IOException();
    }
    void m2() throws IOException{
        m3();
        System.out.println();
    }
    void m1(){
        try{
            m2();
        }catch (IOException e){
            System.out.println("Exception raised");
        }
        System.out.println("Hello");
    }
    public static void main(String [] args){
        Exc_throws_Sid s = new Exc_throws_Sid();
        s.m1();
    }
}
