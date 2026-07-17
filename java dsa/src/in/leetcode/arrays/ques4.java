package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques4 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the no of rows: ");
        int rows = input.nextInt();
        System.out.print("please enter the no of col: ");
        int col = input.nextInt(); 
        int[][] account = new int[rows][col];
        for(int m = 0;m<rows;m++){
            for(int n = 0;n<col;n++){
                account[m][n] = input.nextInt();
            }
        }
        int result = maximumWealth(account);
        System.out.println(result);
    }
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0 ; i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
                if (sum > max){
                    max = sum;
                }

            }
        }
        return max;
    }

    /*
     * Faster style (simple and competitive-programming friendly):
     *
     * public int maximumWealth(int[][] accounts) {
     *     int max = 0;
     *     for (int[] row : accounts) {
     *         int sum = 0;
     *         for (int value : row) {
     *             sum += value;
     *         }
     *         if (sum > max) {
     *             max = sum;
     *         }
     *     }
     *     return max;
     * }
     *
     * Why this is often better:
     * - It calculates the full sum of each row first.
     * - It updates the answer only once per row, which is cleaner.
     * - It uses a simple enhanced-for loop and avoids extra comparisons inside the loop.
     */
    
}
