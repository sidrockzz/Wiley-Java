import java.util.Scanner;

class Account1 implements Runnable{
    Scanner sc=new Scanner(System.in);
    private static int balance=0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    @Override
    synchronized public void run() {
        System.out.println("Enter Value");
        int n=sc.nextInt();
        setBalance(n);
        System.out.println(getBalance());

    }


}
public class Bank {

    public static void main(String[] args) {
        Account1 a=new Account1();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.start();
        t2.start();
    }

}