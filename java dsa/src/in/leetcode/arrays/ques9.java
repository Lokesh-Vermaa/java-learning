package in.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ques9 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array: ");
        int numslength = in.nextInt();
        System.out.println("now enter the index: ");
        int indexlength = in.nextInt();
        int[] nums = new int[numslength];
        int[] index = new int[indexlength];
        if(1 <= numslength && numslength <= 100 && 1 <= indexlength && indexlength <= 100 && numslength == indexlength){
            for(int k = 0; k<numslength;k++){
            nums[k] = in.nextInt();
            if (nums[k]>100 || nums[k]<0){
                System.out.println("please enter no in range");
                return;
            }
        }
        for(int m = 0; m<numslength;m++){
            index[m] = in.nextInt();
            if (index[m]>m || index[m]<0){
                System.out.println("please enter no in range");
                return;
            }
        }
    }else{
        System.out.println("please enter no in range");
            return;
    }
    int[] result = createTargetArray(nums, index);
    System.out.println(Arrays.toString(result));
}
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        int[] num = new int[nums.length];
        for (int j = 0; j < arr.size(); j++) {
             num[j] = arr.get(j);
       }
       return num;
    }
}
