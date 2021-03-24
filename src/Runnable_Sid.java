public class Runnable_Sid implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread: "+i);
        }
    }
    public static void main(String [] args){
        Runnable_Sid s = new Runnable_Sid();
        Thread b = new Thread(s);
        b.start();
        for(int i=0;i<5;i++){
            System.out.println("Main: "+i);
        }
    }
}
