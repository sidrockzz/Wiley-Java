public class Demo4_Sid {
    void m1(){
        m2();
        System.out.println("m1 method");
    }
    void m2(){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        Demo4_Sid  m = new Demo4_Sid();
        m.m1();
    }
}
