package in.oops;

public class ques8 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println(adder);
    }
}
class Arithmetic{
    public int add(int a,int b){
        return a+b;

    }

}

class Adder extends Arithmetic{

}
