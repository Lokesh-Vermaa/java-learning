package in.multithreadingquestions.ques99;

public class Firsttask extends Thread {
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Hello from "+Thread.currentThread().getName());
        }
    }
}
