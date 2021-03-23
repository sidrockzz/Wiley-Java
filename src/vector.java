import java.util.Enumeration;
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
        v.add(3,"C");
        System.out.println(v);
        v.get(3);
        String s1 = (String) v.get(3);
        System.out.println(s1);
        v.set(2,"Z");
        System.out.println(v);
        v.remove("A");
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        //Enumeration
        System.out.println("-----------Enumeration---------------");
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            Object e = en.nextElement();
            System.out.println(e+ " ");
        }
    }
}
