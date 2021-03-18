class ABC{
    final void m1(){
        System.out.println("Method m1");
    }
}

public class Final_Sid extends ABC{
    int a =10;
    //Final cannot be inherited
    void m1(){
        System.out.println("method m1 without final");
    }
    public static void main(String [] args){
        Final_Sid s = new Final_Sid();
        s.m1();
    }
}
