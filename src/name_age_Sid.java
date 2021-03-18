import java.util.Scanner;

public class name_age_Sid {
    String name;
    short age;
    name_age_Sid(String name,short age){
        this.name = name;
        this.age = age;
    }
    void print(){
        System.out.println("Name:"+ name+" "+"\n"+"Age:"+age);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        short age = sc.nextShort();
        name_age_Sid sd = new name_age_Sid(name,age);
        sd.print();
    }
}
