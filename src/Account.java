public class Account extends  Thread{
    int balance ;
    int up ;
    Account(int b,int a){
        balance = b;
        up = a;
    }
    void display()
    {
        System.out.println("You Balance is -- " + balance);
    }
    void update(){
        balance = up + balance;
        System.out.println("You Updated Balance is -- " + balance);
    }

    public static void main(String[] args){
        Account ac = new Account(10000 , 3000){
            public void  run (){
                display();
                update();
            }
        };
        Account ac1 = new Account(10000, 4000){
            public void  run (){
                display();
                update();
            }
        };
        ac.start();
        ac1.start();
    }
}