package in.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        if(n>=1 || n<=Math.pow(10, 4)){
            for(int k = 0; k<n;k++){
                nums[k] = in.nextInt();
                if (nums[0]==0){
                    System.out.println("please enter no in range1");
                    return;
                }

                if (nums[k]<0 || nums[k]>9){
                System.out.println("please enter no in range1");
                return;
            }
            }
        }else{
            System.out.println("please enter no in range2");
            return;
        }
        int k = in.nextInt();
        if (k<1 || k>Math.pow(10, 4)){
            System.out.println("please enter no in range2");
            return;
        }
        List<Integer> result = addToArrayForm(nums, k);
        System.out.println(result); 
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> ans = new ArrayList<>();

    int i = num.length - 1;

    while (i >= 0 || k > 0) {

        if (i >= 0) {
            k += num[i];
            i--;
        }

        ans.add(k % 10);
        k /= 10;
    }

    Collections.reverse(ans);
    return ans;
}
}

