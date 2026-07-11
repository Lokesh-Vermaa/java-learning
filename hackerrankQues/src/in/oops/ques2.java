package in.oops;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int[][] arr = new int[q][3];
        for(int i = 0;i<q;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = input.nextInt();
            }
            
        }
        for(int m = 0;m<q;m++){
            int sum = arr[m][0];
            for(int n = 0;n<arr[m][2];n++){
                sum += (((int) Math.pow(2,n))*arr[m][1]);
                System.out.print(sum + " ");

            }
            System.out.println("");
        }
    
            
        }
}

