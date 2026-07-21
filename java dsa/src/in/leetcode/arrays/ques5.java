package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques5 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[2*arraylength];
        if(arraylength>=1 || arraylength<=500){
            for(int j = 0; j<2*arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>Math.pow(10,3) || nums[j]<1){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int[] result = shuffle(nums,arraylength); 
        System.out.println(Arrays.toString(result));
        
    }
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    }
}
