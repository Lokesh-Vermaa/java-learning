package in.leetcode.arrays;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        if(n>=1 || n<=500){
            for(int k = 0; k<n;k++){
                nums[k] = in.nextInt();

                if (nums[k]<1 || nums[k]>Math.pow(10, 5)){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        int result = findNumbers(nums);
        System.out.println(result); 
    }
    public static int findNumbers(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            while(nums[i]>0){
                count++;
                nums[i]/=10;
            }
            if (count%2==0){
                sum++;
            }

        }
        return sum;
    }
}
