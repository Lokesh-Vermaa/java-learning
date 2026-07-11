package in.multithreadingquestions.q101;

public class q101 {
    public static void main(String[] args) throws InterruptedException {
        Printthread t1 = new Printthread(1);
        Printthread t2 = new Printthread(2);
        Printthread t3 = new Printthread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
