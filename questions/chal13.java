import java.util.Scanner;

public class chal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("enter the no: ");
         

         int num = input.nextInt();
         String nature = (num%2==0)?"even":"odd";
         System.out.println("your no is: "+nature);

    }
}
