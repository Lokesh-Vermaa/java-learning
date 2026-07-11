import java.util.Scanner;

public class chal5 {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial(){
        Scanner input = new Scanner(System.in);
         System.out.print("enter the no:");
         int no = input.nextInt();
        int i = 1;
        int product = 1;
        while (i<=no){
            product *= i;
            i++;
        }
        System.out.println("the factorial of the given no is: "+product);
    }
}
