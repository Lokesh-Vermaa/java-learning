package in.oops;

import java.util.Scanner;

public class ques4 {
    static int length;
    static int breadth;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        breadth = input.nextInt();
        if (length>0 && breadth>0 && length<=100 && breadth<=100){
            int area = length*breadth;
            System.out.println(area);

        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
        
    }
}
