package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques13 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        if(n>=1 || n<=20){
            for(int k = 0; k<n;k++){
            for(int l = 0;l<n;l++){
                nums[k][l] = in.nextInt();

                if (nums[k][l]!= 0 && nums[k][l]!=1){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        int[][] result = flipAndInvertImage(nums);
        System.out.println(Arrays.deepToString(result));

    }
    public int[][] flipAndInvertImage(int[][] image) {
        int temp = 0;
        for(int i = 0;i<image.length;i++){
            for(int j = 0;j<image[i].length/2;j++){
                temp = image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] = temp;
            }
        }
        for(int i = 0;i<image.length;i++){
            for(int j = 0;j<image[i].length;j++){
                image[i][j] ^= 1;

            }
        }
        return image;


        }
}
