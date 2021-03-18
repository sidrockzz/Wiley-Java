class man{
    void m1(){
        System.out.println("M1 Super");
    }
}
public class Super_Method_Sid extends man{
    void m2(){
        this.m1();
        System.out.println("M2 super");
        super.m1();
    }
    void m1(){
        System.out.println("M1 sub");
    }
    public static void main(String [] args){
        Super_Method_Sid s = new Super_Method_Sid();
        s.m2();
    }
}
