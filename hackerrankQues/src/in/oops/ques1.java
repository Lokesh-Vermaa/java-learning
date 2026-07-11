package in.oops;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N<=20 && N>=2){
        for(int i = 1 ;i<=10;i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }
        }else{
            System.out.println("please enter valid no");
        } 
    }

}
  