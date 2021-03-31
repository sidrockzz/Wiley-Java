import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
class clock_Sid extends Thread{
    public static java.util.Date getDate() {
        java.util.Date date = new java.util.Date();
        return date;
    }
    public synchronized void run(){
        try {
            while (true) {
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
      //        Date date = getDate();
                System.out.print(dateFormat.format(getDate())+"\r");
                Thread.sleep(1000);
            }
        }catch(Exception e){
                System.out.println(e);
            }
    }
    public static void main(String... args) {
        clock_Sid s = new clock_Sid();
        Thread t1 = new Thread(s);
        t1.start();
    }
}
