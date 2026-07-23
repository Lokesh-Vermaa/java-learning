package in.leetcode.arrays;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        int[][] nums2 = new int[n][n];
        if(n>=1 || n<=10){
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
        if(n>=1 || n<=10){
            for(int k = 0; k<n;k++){
            for(int l = 0;l<n;l++){
                nums2[k][l] = in.nextInt();

                if (nums2[k][l]!= 0 && nums2[k][l]!=1){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        boolean result = findRotation(nums, nums2);
        System.out.println(result);
    }
    
        
    public boolean findRotation(int[][] mat, int[][] target) {

    for (int i = 0; i < 4; i++) {
        if (isEqual(mat, target)) {
            return true;
        }
        mat = rotate(mat);
    }

    return false;
}

private int[][] rotate(int[][] mat) {

    int n = mat.length;
    int[][] rotated = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            rotated[j][n - 1 - i] = mat[i][j];
        }
    }

    return rotated;
}

private boolean isEqual(int[][] a, int[][] b) {

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] != b[i][j]) {
                return false;
            }
        }
    }

    return true;
}
}

