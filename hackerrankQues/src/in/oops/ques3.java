package in.oops;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

        while (input.hasNextLine()) {

            String sentence = input.nextLine();

            System.out.println(count + " " + sentence);

            if (sentence.equals("end-of-file")) {
                break;
            }

            count++;
        }

        input.close();
    }
}