import java.util.Scanner;

public class chal4m2 {
    public static void main(String[] args) {
        
        oddsum();
    }
    public static void oddsum() {
         Scanner input = new Scanner(System.in);
         System.out.print("enter the no:");
         int no = input.nextInt();
         int i = 0;
       int sum = 0; 
       while (i<=no){
        if (i%2 != 0){
           sum += i;
        }  
        i++; 
       } 
       System.out.println("the sum is :"+sum);
    }
}
