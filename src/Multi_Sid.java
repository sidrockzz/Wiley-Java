public class Multi_Sid extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Thread: "+i);
        }
    }
    public static void main(String [] args){
        Multi_Sid m = new Multi_Sid();
        m.start();
        for(int i=0;i<5;i++){
            System.out.println("Main: "+i);
        }
    }
}
