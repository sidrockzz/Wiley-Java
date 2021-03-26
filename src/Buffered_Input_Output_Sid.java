import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_Input_Output_Sid {
    public static void main(String [] args){
        FileOutputStream w;
        try{
            System.out.println("Writing");
            w = new FileOutputStream("/home/siddharth/IdeaProjects/Wiley/sid.txt");
            BufferedOutputStream br = new BufferedOutputStream(w);
            String data = "My name is Siddharth.";
            byte[] b =data.getBytes();
            br.write(b);
            br.close();
            System.out.println("Written Successfully");
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
}
