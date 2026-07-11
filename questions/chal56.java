import java.util.Scanner;

public class chal56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your marks:");
        int num = input.nextInt();
        String performance = num>80?"high":num>=50?"moderate":"low";
        System.out.println("your performance is "+performance);
    }
}
