package in.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ques6 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the extra candies: ");
        int extracandies = in.nextInt();
        if(extracandies>50 || extracandies<1){
            System.out.println("please give good rabge");
            return;
        }
        System.out.println("please enter the arraylength:");
        int arraylength = in.nextInt();
        int[] nums = new int[arraylength];
        if(arraylength>=2 || arraylength<=100){
            for(int j = 0; j<arraylength;j++){
            nums[j] = in.nextInt();
            if (nums[j]>100 || nums[j]<1){
                System.out.println("please enter no in range");
                return;
            }
        }
        }else{
            System.out.println("please enter no in range");
            return;
        }
        List<Boolean> result = kidsWithCandies(nums,extracandies); 
        System.out.println(result);

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) {
            if(i>max){
                max = i;

            }
        }
        ArrayList<Boolean> gool = new ArrayList<>();
        for (int i : candies) {
            if (i+extraCandies>=max){
                gool.add(true);
            }else{
                gool.add(false);
            }
        }
        return gool;
    }
}
