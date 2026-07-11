import java.util.Scanner;

public class chal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("enter the marks: ");
         int x = input.nextInt();
         String performance = x>80?"high":(x>=50?"moderate":"low");
         System.out.println("your performance is: "+performance);

    }
}
