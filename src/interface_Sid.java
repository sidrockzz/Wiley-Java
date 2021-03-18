interface abc{
    void add();
    void div();
}
interface abcd{
    void mul();
    void sub();
}
class abcde{
    void m1(){
        System.out.println("M1");
    }
}
//Multiple Inheritance Achieved
public class interface_Sid extends abcde implements abc,abcd{
    interface_Sid(){
        System.out.println("Multiple Inheritance Achieved");
    }
    public static void main(String [] args){
        interface_Sid s = new interface_Sid();
        s.add();
        s.div();
        s.mul();
        s.sub();
        s.m1();
    }

    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void div() {
        System.out.println("Div");
    }

    @Override
    public void mul() {
        System.out.println("Mul");
    }

    @Override
    public void sub() {
        System.out.println("Sub");
    }
}
