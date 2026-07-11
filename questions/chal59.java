import java.util.Scanner;

public class chal59 {
    public static void main(String[] args) {
        String password = "lokiyt090";
        String pass;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the password:");
            pass = input.nextLine();

        }
        while(!pass.equals(password));
    }
}
