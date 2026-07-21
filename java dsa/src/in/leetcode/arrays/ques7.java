package in.leetcode.arrays;

import java.util.Scanner;

/*public class ques7 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=1 || arraylength<=100){
            for(int k = 0; k<arraylength;k++){
            nums[k] = in.nextInt();
            if (nums[k]>100 || nums[k]<1){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }
}*/
// above one is a brute force method we will do it faster by pnc

public class ques7 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=1 || arraylength<=100){
            for(int k = 0; k<arraylength;k++){
            nums[k] = in.nextInt();
            if (nums[k]>100 || nums[k]<1){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        for (int i : nums) {
            count += freq[i];
            freq[i]++;
        }
        return count;
    }
} 