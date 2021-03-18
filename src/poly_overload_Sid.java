public class poly_overload_Sid {
    poly_overload_Sid(){
        System.out.println("Constructor overloading");
    }
    poly_overload_Sid(int a){
        System.out.println("Constructor overloaded with "+a);
    }
    void m1(long a,long b){
        System.out.println("This is "+a+" and "+b+" method");
    }
    void m1(int a,int b){
        System.out.println("This is "+a+" and "+b+" method");
    }
    void m1(String s){
        System.out.println("This is m1 "+s+" method");
    }
    void m1() {
        System.out.println("This is m1 method");
    }
    void m1(int a){
        System.out.println("This is m1 "+a+" method");
    }
    public static void main(String [] args){
        poly_overload_Sid s = new poly_overload_Sid();
        poly_overload_Sid s1 = new poly_overload_Sid(2);
        s.m1();
        s.m1(3);
        s.m1("Sid");
        s.m1(2,3);
        s.m1(20L,30L);
    }
}
