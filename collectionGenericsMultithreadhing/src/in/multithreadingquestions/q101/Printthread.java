package in.multithreadingquestions.q101;

public class Printthread extends Thread{
    private final int threadnumber;
    public Printthread(int threadnumber){
        this.threadnumber = threadnumber;
    }
    public void run(){
        System.out.println("Thread starting "+Thread.currentThread().getName()+threadnumber);

        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            System.out.println("session interrupted"+e.getMessage());
        }

        System.out.println("thread ending "+Thread.currentThread().getName()+threadnumber);
    }
    
    
}
