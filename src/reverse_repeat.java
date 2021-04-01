import java.util.Scanner;

public class reverse_repeat {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] a = new int[1000];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
        String b="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(a[s.charAt(i)]==1){
                b+=s.charAt(i);
            }
            else{
                count++;
                System.out.println("there is a duplicate character");
            }
        }
        System.out.println(count/2+" "+b);
    }
}
