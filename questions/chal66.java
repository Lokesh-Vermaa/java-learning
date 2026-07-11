import java.util.Scanner;

public class chal66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of no you want to sum:");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 0;i<n;i++){
            int no = input.nextInt();
            if(no<=0){
                continue;
            }
            sum = sum + no;
        }
        System.out.println("the sum of your numbers is: "+sum);
    }
    
}
