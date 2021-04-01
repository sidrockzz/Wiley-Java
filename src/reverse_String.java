import java.util.Scanner;

public class reverse_String {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        System.out.println(s);
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer(s);
        s2.reverse();
        System.out.println(s2);
    }
}
