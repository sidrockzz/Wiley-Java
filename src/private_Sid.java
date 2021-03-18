class privatisation {
    private int a =10;
    private int b = 20;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a =a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
}

public class private_Sid extends privatisation{
    public static void main(String [] args){
        private_Sid s = new private_Sid();
        s.setA(10);
        int a = s.getA();
        s.setB(20);
        int b = s.getB();
        System.out.println(a+" "+b);
    }
}
