import java.util.Scanner;

public class chal7 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("enter the no:");
         int no1 = input.nextInt();
         System.out.print("enter the sec no:");
         int no2 = input.nextInt();
        
        int lcm = factor(no1,no2);
        System.out.println("the lcm of the given no is :"+lcm);
    }
    public static int factor(int no1,int no2) {
         int i = Math.max(no1,no2);
         while (true){
            if ((i%no1 == 0) && (i%no2 == 0)) {
                  break;
            }
         i++;
         }
         return i;

    }
}