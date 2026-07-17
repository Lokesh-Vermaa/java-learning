package in.generalpracticequestions;
//checking no of occurenece of a no in an int 

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the no:");
        int n = in.nextInt();
        System.out.println("please enter the digit you want to find about:");
        int digit = in.nextInt();
        int count = 0;
         while(n > 0){
                if (n%10 == digit){
                    count++;
                }
                n = n/10;
            }
            System.out.println("the frequency is: "+count);

    }
}
