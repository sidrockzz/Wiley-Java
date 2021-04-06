import java.util.concurrent.*;
class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    public void run() {
        for (int ii = 1; ii <= lastNum; ii++) {
            System.out.println(ii + " ");
        }
        System.out.println();
    }
}
class PrintChar implements Runnable {
    private char charToPrint;
    private int times;
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }
    @Override
    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.println(charToPrint +" ");
        }
        System.out.println();
    }
}
public class ExecutorDemo {
    public static void main(String [] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new PrintChar('a',100));
        executor.execute(new PrintChar('b',100));
        executor.execute(new PrintNum(100));
        executor.shutdown();
    }
}
