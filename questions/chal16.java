import java.util.Scanner;

public class chal16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass;
        do{
            System.out.print("enter the password: ");
            pass = input.nextLine();            
        }while(!pass.equals("Pudina"));
    }
}
