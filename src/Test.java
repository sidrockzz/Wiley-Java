import java.util.*;



class Demo{
    int num;
    boolean getValue=false;
    synchronized public void read() {
        while(!getValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        num=sc.nextInt();
        getValue=false;
        notify();
    }

    synchronized public void op() {
        while(getValue) {
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
        num=num*num;
        System.out.println("Value :"+num);
        getValue=true;
        notify();
    }
}


class Producer implements Runnable {
    Demo q;

    public Producer(Demo q) {
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();



    }

    public void run() {
        int i=0;
        while(true) {
            q.read();

        }
    }

}

class Consumer implements Runnable {

    Demo q;

    public Consumer(Demo q) {
        this.q = q;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();

    }

    public void run() {

        while(true) {
            q.op();
            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

}



public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Demo q = new Demo();
        new Consumer(q);
        new Producer(q);
    }

}