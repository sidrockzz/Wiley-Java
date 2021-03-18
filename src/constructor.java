public class constructor {
    constructor(){
        this(4);
        System.out.println("Hi");
    }
    constructor(int a){
        System.out.println("hello");
    }
    public static void main(String [] args){
        constructor c = new constructor();
    }
}
