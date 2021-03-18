import java.util.Scanner;
class luffy{
    void vice(){
        System.out.println("Zoro");
    }
    void doctor(){
        System.out.println("Chopper");
    }
}

public class poly_override_Sid extends luffy{
    void vice(){
        System.out.println("Marco");
    }
    public static void main(String [] args){
        luffy l;
        l = new luffy();
        l.vice();
        l = new poly_override_Sid();
        l.vice();
        l.doctor();
    }
}
