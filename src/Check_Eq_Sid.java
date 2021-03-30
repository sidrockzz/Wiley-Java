import java.util.Scanner;

public class Check_Eq_Sid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equation: ");
        String s = sc.nextLine();
        Stack <String> sn = new Stack<String>();
        if(sn.isValid(s))
            System.out.println("Valid");
        else
            System.out.println("not valid");
    }
}
