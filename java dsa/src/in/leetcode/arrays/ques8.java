package in.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ques8 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=2 || arraylength<=500){
            for(int k = 0; k<arraylength;k++){
            nums[k] = in.nextInt();
            if (nums[k]>100 || nums[k]<0){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int[] ans = new int[nums.length];
        for (int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums.length;j++){
                if(nums[i]==copy[j]){
                    ans[i]=j;

                }
            }
        }
        return ans;
    }
}
//much faster code
/*
class Solution {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=2 || arraylength<=500){
            for(int k = 0; k<arraylength;k++){
            nums[k] = in.nextInt();
            if (nums[k]>100 || nums[k]<0){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {

    int[] freq = new int[101];

    // Count frequencies
    for (int num : nums) {
        freq[num]++;
    }

    // Prefix sum
    for (int i = 1; i < 101; i++) {
        freq[i] += freq[i - 1];
    }

    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            result[i] = 0;
        } else {
            result[i] = freq[nums[i] - 1];
        }
    }

    return result;
}
} */