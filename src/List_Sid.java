import java.util.*;

public class List_Sid {
    public static void main(String [] args){
        System.out.println("-----------ArrayList---------------");
        ArrayList<Integer> al
                = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            al.add(i);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
        System.out.println("-----------LinkedList---------------");
    LinkedList ob=new LinkedList();
        ob.add("A");
        ob.add("assdfg");
        ob.add(123);
        System.out.println(ob);
    String s=(String) ob.get(1);
        System.out.println(s);
        ob.set(1,"s");
        System.out.println(ob);
        ob.remove("A");
        System.out.println(s);
        System.out.println("Iterator");
    Iterator it=ob.iterator();
        while(it.hasNext())
    {
        Object e=it.next();
        System.out.println(e);
    }
        System.out.println("ListIterator");
    ListIterator lit=ob.listIterator();
    lit = ob.listIterator();
        while(lit.hasNext())
    {
        Object e=lit.next();
        System.out.println(e);
    }
        System.out.println("-----------List---------------");
        List<Integer> l1
                = new ArrayList<Integer>();

        l1.add(0, 1);
        l1.add(1, 2);
        System.out.println(l1);
        List<Integer> l2
                = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l1.addAll(1, l2);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        System.out.println(l1.get(3));
        l1.set(0, 5);
        System.out.println(l1);
    }
}
