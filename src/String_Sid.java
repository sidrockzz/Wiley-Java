import java.util.Scanner;

public class String_Sid {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        // Which can be used without new keyword only class
        String st = new String("Hello");
        String st1 = "Hi";
        //Not referred
        st.concat(" Sid");
        st1.concat(" Sid");
        int a = 9;
        System.out.println(st+" "+st1);
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hi";
        String s4 = "Hi";
        if(s1==s2){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are different object");
        }
        if(s3==s4){
            System.out.println("s3 and s4 are equal");
        }
        else{
            System.out.println("s3 and s4 are different object");
        }
        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are different object");
        }

        if(s3.equals(s4)){
            System.out.println("s3 and s4 are equal");
        }
        else{
            System.out.println("s3 and s4 are different object");
        }
    }
}
