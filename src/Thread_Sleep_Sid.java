public class Thread_Sleep_Sid extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                System.out.println("Exception raised");
            }
            System.out.println(i);
        }
    }
    public static void main(String [] args){
        Thread_Sleep_Sid s = new Thread_Sleep_Sid();
        Thread_Sleep_Sid s1 = new Thread_Sleep_Sid();
        s.start();
        s1.start();
    }
}
