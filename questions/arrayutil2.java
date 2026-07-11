import java.util.Scanner;

public class arrayutil2 {
     public static String[] inputarray(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the no of elements: ");
        int n = input.nextInt();
        input.nextLine();
        String[] num = new String[n];
        int i = 0;
        int sum = 0;
        while (i<n){
            System.out.print("enter the "+(i+1)+"th element:");
            num[i] = input.nextLine();
            i++;
        }
        return num;
    }
}
