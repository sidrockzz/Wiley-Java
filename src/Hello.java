import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Hello extends TimerTask {
    public void run() {
        System.out.println("Hello World!");
        System.out.println(new Date());
    }
public static void main(String [] args) {
    Timer timer = new Timer();
    timer.schedule(new Hello(),0,60000);//10 Min
}
}