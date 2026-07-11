import java.util.Scanner;

public class chal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("enter the no: ");
         int x = input.nextInt();
         int absolute = x>0?x:(-x);
         System.out.println("the absolute value of the integer is: "+absolute);
    }
}
