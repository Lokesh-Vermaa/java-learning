package in.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques12 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=1 || arraylength<=100){
            for(int j = 0; j<arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>100 || nums[j]<-100){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int result = largestAltitude(nums);
        System.out.println(result); 
    }
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
