import java.util.Scanner;

public class chal8 {
    public static void main(String[] args) {
        array();
    }
    public static void array(){
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
        System.out.println("the sum of all the elements of the array is: "+sum);
        System.out.println("the average of all the elements of the array is: "+(sum)/n);

    }
}
