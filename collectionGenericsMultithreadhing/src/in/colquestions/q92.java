//Write a method that swaps two elements in an ArrayList, given  their indices.
package in.colquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q92 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.asList("lokesh","keshav","omesh","lokesh");
        System.out.println("tell me my friend what indeces you wanna swap");
        int a = input.nextInt();
        int b = input.nextInt();
        swaptheelements(list,a,b);
        System.out.println(list);

    }

    public static void swaptheelements(List<String> Stringlist,int i,int j){
        Collections.swap(Stringlist,i,j);
       
            }
}
