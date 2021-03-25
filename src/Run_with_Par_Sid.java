public class Run_with_Par_Sid extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("aaa " + i);
        }

    }
    public void run(int a) {
        for (int i = 0; i < 5; i++) {

            System.out.println("bb" + i);
        }

    }

    public static void main(String[] args) {
        Run_with_Par_Sid bb = new Run_with_Par_Sid();
        bb.start();
        bb.run(2);
    }
}
