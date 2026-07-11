//THIS IS FUNCTION WITHOUT ANY RETURN VALUE THATS WHY VOID IS USED
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        System.out.println("hello guys today we will make a patern:");
        pattern();
    }
    public static void pattern(){
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

