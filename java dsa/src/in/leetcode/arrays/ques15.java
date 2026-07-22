package in.leetcode.arrays;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        if(n>=1 || n<=100){
            for(int k = 0; k<n;k++){
            for(int l = 0;l<n;l++){
                nums[k][l] = in.nextInt();

                if (nums[k][l]<1 || nums[k][l]>100){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        int result = diagonalSum(nums);
        System.out.println(result); 

    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0;i<mat.length;i++){
                sum += mat[i][i] + mat[i][mat.length-i-1];
           
        }
        if (mat.length%2==0){
            return sum;
        }else{
            return sum-mat[mat.length/2][mat.length/2];
        }
        
    }
}
