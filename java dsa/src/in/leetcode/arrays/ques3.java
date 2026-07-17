package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques3 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=1 || arraylength<=1000){
            for(int j = 0; j<arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>Math.pow(10,6) || nums[j]<-Math.pow(10, 6)){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int[] result = runningSum(nums); 
        System.out.println(Arrays.toString(result));
        
    }
    public int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
                nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
