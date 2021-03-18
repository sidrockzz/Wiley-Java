public class Var_arg_Sid {
    void m1(int ...a){
        System.out.println("Values are " +a);
    }

    public static void main(String [] args){
        Var_arg_Sid v = new Var_arg_Sid();
        v.m1();
     //   v.m2(1,'p',,12,21);
        v.m1(1);
        v.m1(1,2);
        v.m1(1,2,3);
        v.m1(1,2,3,4);
    }
}
