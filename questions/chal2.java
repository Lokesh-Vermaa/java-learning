import java.util.Scanner;

public class chal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first no:");
        int no1 = input.nextInt();
        System.out.print("enter the sec no:");
        int no2 = input.nextInt();
        int x = no1; 
        no1 = no2;
        no2 = x;

        
        System.out.println("no1 is="+no1);
        System.out.print("no2 is="+no2);
        

    }
}
