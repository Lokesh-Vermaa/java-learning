package in.leetcode.arrays;

import java.util.Scanner;

public class ques10 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the string: ");
        String sentence = in.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("please enter loewletter only");
            return;
        }
    }
    Boolean result = checkIfPangram(sentence);
    System.out.println(result);
    }
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
        if (sentence.indexOf(ch) == -1) {
            return false;
        }
    }
    return true;
    }
}
