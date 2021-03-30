import java.io.*;

public class Serialisation {
    Serialisation(String s) {
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // Creating the object
            Student s1 = new Student(11, "ravi");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("ABC.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}