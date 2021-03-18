import java.util.Scanner;

public class Addition_Sid {
    int a;
    int b;
    Addition_Sid(int a,int b){
        this.a =a;
        this.b =b;
    }
    int add(){
        return a+b;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Addition_Sid a1 = new Addition_Sid(a,b);
        System.out.println(a1.add());
    }
}
