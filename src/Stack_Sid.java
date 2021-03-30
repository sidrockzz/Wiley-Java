import java.util.Stack;

public class Stack_Sid {
    public static void main(String [] args){
        Stack <Integer> st = new Stack<Integer>();
        st.push(20);
        st.push(50);
        System.out.println(st);
        System.out.println(st.peek());
        st.add(40);
        System.out.println(st);
    }
}
