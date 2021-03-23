import java.util.Vector;

public class vector {
    public static void main(String [] args){
        //vector
        Vector v = new Vector();
        v.add("A");
        v.add(null);
        v.add(new Integer(101));
        v.add("B");
        v.add(1);
        System.out.println(v);
    }
}
