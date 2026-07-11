import java.util.Scanner;

public class arrayutil {
    public static int[] inputarray(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the no of elements: ");
        int n = input.nextInt();
        int[] num = new int[n];
        int i = 0;
        int sum = 0;
        while (i<n){
            System.out.print("enter the "+(i+1)+"th element:");
            num[i] = input.nextInt();
            sum += num[i];
            i++;
        }
        return num;
    }
}

