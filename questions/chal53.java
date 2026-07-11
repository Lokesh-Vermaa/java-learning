import java.util.Scanner;

public class chal53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int num1 = input.nextInt();
        System.out.println("Enter the second no:");
        int num2 = input.nextInt();

        int minnum = num1<num2?num1:num2;

        System.out.println(minnum+ " is the minimum no ");

    }
    
}
