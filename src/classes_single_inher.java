class parent{
    parent(){
        System.out.println("Parent");
    }
    void parentcall(){
        System.out.println("Calling parent");
    }
}
class Child extends parent{
    Child(){
        System.out.println("Child");
    }
}
public class classes_single_inher {
    public static void main(String [] args){
        Child ch = new Child();
        ch.parentcall();
    }
}
