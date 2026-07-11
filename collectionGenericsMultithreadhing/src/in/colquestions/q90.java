package in.colquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q90 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lokesh","keshav","omesh");
        sortindescending(list);
        System.out.println(list);

    }

    public static void sortindescending(List<String> Stringlist){
        Collections.sort(Stringlist,new java.util.Comparator<String>() {
            public int compare(String one,String two){
                return two.compareTo(one);
                
            }
        });
    }
    
}
