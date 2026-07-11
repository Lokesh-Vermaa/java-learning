import java.util.Scanner;

public class chal6 {
    public static void main(String[] args) {
        digitsum();
    }
    public static void digitsum(){
         Scanner input = new Scanner(System.in);
         System.out.print("enter the no:");
         int no = input.nextInt();
         int sum = 0;
         while (no>0){
            sum += no%10;
            no = no/10;
           
        }
        System.out.println("the sum of the digits is: "+sum);
    }
}
