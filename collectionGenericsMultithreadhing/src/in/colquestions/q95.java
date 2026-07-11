package in.colquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class q95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        uniqueness(word);

    }

    public static void uniqueness(String Stringlist){
        Set<Character> sett = new HashSet<>();
        for(int i = 0;i<Stringlist.length();i++){
            sett.add(Stringlist.charAt(i));
        }
        System.out.println("the no of unique letters are "+sett.size());
            }
}
