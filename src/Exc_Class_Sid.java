import java.io.IOException;

class ex{
    void m1() throws IOException{
        throw new IOException("New");
    }
}
public class Exc_Class_Sid extends ex{
    public static void main(String [] args){
        ex s = new ex();
        try {
            s.m1();
        }catch (IOException e){
            System.out.println("Exception arise");
        }
    }
}
