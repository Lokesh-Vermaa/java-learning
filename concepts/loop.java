import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no :");
        int n = input.nextInt();
        int star = 0;
        while (star<n){
            System.out.print("*");
            int i = 0;
            while (i<star){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            star++;
        }
    }
    
}
