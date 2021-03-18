abstract class a{

    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    abstract void divide(int c,int d);
    abstract void multiply(int a, int b);
}
class abstract_Sid extends a{
    //@Override
    void divide(int c, int d) {

        System.out.println("div " + (d / c));
    }
    //@Override
    void multiply(int a,int b){
        System.out.println("multiply:" + a*b);
    }
    public static void main(String[] args) {
        abstract_Sid ob=new abstract_Sid();
        ob.add(10,20);
        ob.divide(20,40);
        ob.multiply(10,10);
    }
}

