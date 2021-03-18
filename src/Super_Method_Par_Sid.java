class Sid1{
    Sid1(int a,int b){
        System.out.println("Con a");
    }
}
public class Super_Method_Par_Sid extends Sid1{
    Super_Method_Par_Sid(int a){
        super(2,3);
        System.out.println("Parameter");
    }
    public static void main(String [] args){
        Super_Method_Par_Sid s = new Super_Method_Par_Sid(3);
    }
}
