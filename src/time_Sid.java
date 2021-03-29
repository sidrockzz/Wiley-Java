import java.util.Date;

public class time_Sid {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println(new Date());
                Thread.sleep(60 * 1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}