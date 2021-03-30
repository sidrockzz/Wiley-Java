public class Generic_Stack_Sid<T extends Object> {
    private int stackSize;
    private T[] stackArray;
    private int top;
    public Generic_Stack_Sid(int size) {
        this.stackSize = size;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }
    public void push(T entry) throws Exception {
        if(this.isStackFull()){
            System.out.println("Stack Overflow");
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArray[++top] = entry;
    }
    public T pop() throws Exception {
        if(this.isStackEmpty()){
            System.out.println("Stack underflow.");
        }
        T entry = this.stackArray[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
    public T peek() {
        return stackArray[top];
    }
    public boolean isStackEmpty() {
        return (top == -1);
    }
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
    private void increaseStackCapacity(){
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArray[i];
        }
        this.stackArray = newStack;
        this.stackSize = this.stackSize*2;
    }
    public static void main(String args[]){
        try {
            Generic_Stack_Sid<String> stringStack = new Generic_Stack_Sid<>(2);
            stringStack.push("w3spoint");
            Generic_Stack_Sid<Integer> integerStack = new Generic_Stack_Sid<>(2);
            integerStack.push(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}