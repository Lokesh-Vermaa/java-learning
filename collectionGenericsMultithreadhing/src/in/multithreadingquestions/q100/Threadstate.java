package in.multithreadingquestions.q100;

public class Threadstate extends Thread {
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("during this time the state is"+getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
