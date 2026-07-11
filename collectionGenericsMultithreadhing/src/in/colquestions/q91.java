package in.colquestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class q91 {
     public static void main(String[] args) {
        List<String> list = Arrays.asList("lokesh","keshav","omesh","lokesh");
        frequency(list,"lokesh");
        System.out.println(list);

    }

    public static void frequency(List<String> Stringlist,String element){
        int count = Collections.frequency(Stringlist,element);
        System.out.println("the frequency of the given element is: "+ count);
            }
    
}
