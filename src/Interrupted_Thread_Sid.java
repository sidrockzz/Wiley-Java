public class Interrupted_Thread_Sid extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("Exception raised");
            }
            System.out.println("i: " + i);
        }
    }

    public static void main(String[] args) {
        Interrupted_Thread_Sid n1 = new Interrupted_Thread_Sid();
        Interrupted_Thread_Sid n2 = new Interrupted_Thread_Sid();
        Interrupted_Thread_Sid n3 = new Interrupted_Thread_Sid();
        n1.start();

        try {
            n1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Exception raised");
        }

        n2.start();
        n3.start();
    }
}