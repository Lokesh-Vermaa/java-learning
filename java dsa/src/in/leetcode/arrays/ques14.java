package in.leetcode.arrays;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int arraylength = in.nextInt();
        int[][] indices = new int[arraylength][2];
        for(int z = 0;z<arraylength;z++){
            indices[z][0] = in.nextInt();
            indices[z][1] = in.nextInt();
        }
        int result = oddCells(m, n, indices);
        System.out.println(result);
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i = 0;i<indices.length;i++){
            for(int j = 0;j<mat[indices[i][0]].length;j++){
                mat[indices[i][0]][j]++;

            }
            for(int k = 0;k<mat.length;k++){
                mat[k][indices[i][1]]++;
            }
        }
        int count = 0;
        for(int p = 0;p<m;p++){
            for(int q = 0;q<n;q++){
                if(mat[p][q]%2!=0){
                    count++;
                }
                
            }
        }
        return count;
    }
}
//faster approach 
/*public static int oddCells(int m, int n, int[][] indices) {
    int[] rows = new int[m];
    int[] cols = new int[n];

    for (int[] index : indices) {
        rows[index[0]]++;
        cols[index[1]]++;
    }

    int count = 0;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if ((rows[i] + cols[j]) % 2 == 1) {
                count++;
            }
        }
    }

    return count;
} */