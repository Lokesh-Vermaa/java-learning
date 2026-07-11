package in.oops;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = String.valueOf(n);
        if (n == Integer.parseInt(s)){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
    }
}
