import java.util.Scanner;

public class Power_Number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        int b = sc.nextInt();
        System.out.println((long) Math.pow(a,b));
    }
}
