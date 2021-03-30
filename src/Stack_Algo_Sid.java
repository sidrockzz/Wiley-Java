public class Stack_Algo_Sid {
    int[] stack;
    int top;
    int capacity;
    Stack_Algo_Sid(int n){
        stack = new int[n];
        capacity = n;
        top =-1;
    }
    public int getSize() {
        return top + 1;
    }
    public Boolean isEmpty() {
        return top == -1;
    }
    public Boolean isFull() {
        return top == capacity - 1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        stack[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return stack[top--];
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Stack_Algo_Sid s = new Stack_Algo_Sid(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("popping");
        System.out.println(s.pop());
        s.print();
    }
}
