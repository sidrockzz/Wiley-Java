import java.util.Scanner;
import java.util.Stack;

public class equation_Sid {
    static boolean check(String s){
        Stack <Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')':
                    check = st.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = st.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = st.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)){
            System.out.println("Balanced");
        }
        else System.out.println("unbalanced");
    }
}
