import java.util.Scanner;

public class chal4 {
    public static void main(String[] args) {
        
         int oddkasum = oddsum();
         System.out.println("sum of all the odd no is: "+ oddkasum);
    }
    public static int oddsum() {
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
       return sum;
    }
}      
