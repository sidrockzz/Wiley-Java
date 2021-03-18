public class demo1_Sid {
    int a;
    int b;
    void m1(int c,int d){
        a = c;
        b = d;
    }
    void m2(){
        System.out.println(a+b);
        //System.out.println(this.a+this.b);
    }
    public static void main(String[] args){
        demo1_Sid m = new demo1_Sid();
        m.m1(2,4);
        m.m2();
        System.out.println(m.a+" "+m.b);
    }
}
