import java.util.concurrent.*;
class PrintNum implements Runnable{
    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    public synchronized void run() {
        for (int ii = 1; ii <= lastNum; ii++) {
            System.out.println(ii + " ");
        }
        System.out.println();
    }
}
class PrintChar implements Runnable{
    private char charToPrint;
    private int times;
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }
    @Override
    public synchronized void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(charToPrint +" ");
        }
        System.out.println();
    }
}
public class ExecutorDemo {
    public static void main(String [] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        PrintChar pt = new PrintChar('a',100);
        PrintChar pt1 = new PrintChar('b',100);
        Thread t1 = new Thread(pt);
        Thread t2 = new Thread(pt1);
        PrintNum pt3 = new PrintNum(100);
        Thread t3 = new Thread(pt3);
        executor.execute(t1);
        t1.join();
        executor.execute(t2);
        t2.join();
        executor.execute(t3);
        t3.join();
        executor.shutdown();
    }
}
