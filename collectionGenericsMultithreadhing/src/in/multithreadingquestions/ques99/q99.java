package in.multithreadingquestions.ques99;

public class q99{
    public static void main(String[] args) {
        Firsttask t1 = new Firsttask();
        Secontask t2 = new Secontask();

        t1.start();
        t2.start();
    }
}
