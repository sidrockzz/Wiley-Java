import java.util.Stack;

public class Reverse_Integer_Sid {
    Stack<Integer> st = new Stack<Integer>();
    void push(int n){
        while(n!=0){
            st.push(n%10);
            n=n/10;
        }
    }
    int reverse(int n){
        push(n);
        int r = 0;
        int i =1;
        while(!st.isEmpty()){
            r = r + (st.peek()*i);
            st.pop();
            i=i*10;
        }
        return r;
    }
    public static void main(String [] args){
        int n = 2098638;
        Reverse_Integer_Sid s = new Reverse_Integer_Sid();
        System.out.println(s.reverse(n));
    }
}
