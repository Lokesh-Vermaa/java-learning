package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        for(int j = 0; j<arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>arraylength || nums[j]<0){
                System.out.println("please enter no in range");
                return;
            }
        }
        int[] result = buildArray(nums); 
        System.out.println(Arrays.toString(result));
        
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
}

// 2 things to remember in first to print content of array it is wiser to use tostring and second breaking still executes 
// the remaining code so if you want to stop code at any moment like in this one please use return



// here is the more faster code where no ans is formed only nums is used for time complexity 
/*public int[] buildArray(int[] nums) {
    int n = nums.length;

    // Store both old and new values
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] + n * (nums[nums[i]] % n);
    }

    // Extract the new values
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] / n;
    }

    return nums;
}*/
