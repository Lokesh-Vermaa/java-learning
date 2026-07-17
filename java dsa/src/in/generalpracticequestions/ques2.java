package in.generalpracticequestions;

import java.util.Scanner;

// reverse the no
public class ques2 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("please enter the no:");
        int n = in.nextInt();
        int reverse = 0;
        while(n>0){
            reverse = ((reverse*10) + (n%10));
            n = n/10;
        }

        System.out.println("the reverse of the no is: "+reverse);
    }
}
