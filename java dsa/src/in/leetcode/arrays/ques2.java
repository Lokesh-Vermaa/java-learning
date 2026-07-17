package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques2 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=1 || arraylength<=1000){
            for(int j = 0; j<arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>1000 || nums[j]<1){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int[] result = getConcatenation(nums); 
        System.out.println(Arrays.toString(result));
        
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}
//this is fastest method to concatinate by built in method sam can be done by simple hard approach for dsa
/*import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[index++] = arr2[i];
        }

        System.out.println(Arrays.toString(result));
    }
} */