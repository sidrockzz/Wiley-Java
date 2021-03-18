public class demo2_Sid {
    int a;
    int b;
    void m1(int a,int b){
        this.a = a;
        this.b = b;
    }
    void m2(){
        System.out.println(a+b);
        //System.out.println(this.a+this.b);
    }
    public static void main(String[] args){
        demo2_Sid m = new demo2_Sid();
        m.m1(2,4);
        m.m2();
        System.out.println(m.a+" "+m.b);
    }
}