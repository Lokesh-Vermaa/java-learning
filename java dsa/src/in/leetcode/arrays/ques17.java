package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] nums = new int[m][n];
        if(n>=1 || n<=1000 || m>=1 || m<=1000){
            for(int k = 0; k<m;k++){
            for(int l = 0;l<n;l++){
                nums[k][l] = in.nextInt();

                if (nums[k][l]<-Math.pow(10, 9) || nums[k][l]>Math.pow(10, 9)){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        int[][] result = transpose(nums);
        System.out.println(Arrays.deepToString(result)); 
    }

    public static int[][] transpose(int[][] matrix) {

    int[][] result = new int[matrix[0].length][matrix.length];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            result[j][i] = matrix[i][j];
        }
    }

    return result;
    }
}
// more faster way
/*public static int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] ans = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
        int[] row = matrix[i];
        for (int j = 0; j < cols; j++) {
            ans[j][i] = row[j];
        }
    }

    return ans;
} */