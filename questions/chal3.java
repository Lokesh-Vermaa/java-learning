import java.util.Scanner;

public class chal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no:");
        int num = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }
    }
}
