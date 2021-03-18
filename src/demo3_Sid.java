public class demo3_Sid {

    void m1(){
        this.m2();
        System.out.println("m1 method");
    }
    void m2(){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        demo3_Sid m = new demo3_Sid();
        m.m1();
    }
}
