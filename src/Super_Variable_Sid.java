class Sid{
    int a =10;
    int b =10;
}
public class Super_Variable_Sid extends Sid{
    int a =20;
    int b = 40;
    void m1(int a,int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
        System.out.println(super.a+super.b);
    }
    public static void main(String [] args){
        Super_Variable_Sid s = new Super_Variable_Sid();
        s.m1(3,4);
    }
}
