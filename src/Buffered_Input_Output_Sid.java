import java.io.*;

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
        try{
            System.out.println("Reading");
            FileInputStream f=new FileInputStream("/home/siddharth/IdeaProjects/Wiley/sid.txt");
            BufferedInputStream r = new BufferedInputStream(f);
            int Rdata;
            while ((Rdata = r.read()) != -1) {
                // Rdata=r.readLine();
                System.out.print((char)Rdata);
            }
            r.close();
            System.out.println("\nReading Done");
        }
        catch (FileNotFoundException e){
            System.out.println("Error:");
        }catch (IOException f) {
            System.out.println("Exception " + f);
        }
    }
}
