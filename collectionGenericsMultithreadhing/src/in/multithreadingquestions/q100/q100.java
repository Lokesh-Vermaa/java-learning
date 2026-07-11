package in.multithreadingquestions.q100;

public class q100 {
    public static void main(String[] args) throws InterruptedException {
        Threadstate t1 = new Threadstate();
        System.out.println("the initial state is: "+t1.getState());
        t1.start();
        t1.join();
        System.out.println("the final state is : "+t1.getState());

    }
}
