package in.colquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q93 {
     public static void main(String[] args) {
        List<String> list = Arrays.asList("lokesh","keshav","omesh","lokesh");
        reversethelist(list);
        System.out.println(list);

    }

    public static void reversethelist(List<String> Stringlist){
        Collections.reverse(Stringlist);
            }
    
}
