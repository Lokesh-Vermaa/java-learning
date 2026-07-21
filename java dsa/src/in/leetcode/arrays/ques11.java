package in.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
public class ques11 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please ");

         int rows = in.nextInt();
        in.nextLine(); 

List<List<String>> items = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
    List<String> row = new ArrayList<>();

    for (int j = 0; j < 3; j++) {
        row.add(in.next());
    }

    items.add(row);
}
in.nextLine();
System.out.println("please enter rulekey");
String ruleKey = in.nextLine();
System.out.println("please enter rule value");
String ruleValue = in.nextLine();
int result = countMatches(items,ruleKey , ruleValue);
System.out.println(result);

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")){
            for(int i = 0; i<items.size();i++){
                    if(items.get(i).get(0).equals(ruleValue)){
                        count++;
                }

            }

        } else if (ruleKey.equals("color")){
            for(int i= 0; i<items.size();i++){
                    if(items.get(i).get(1).equals(ruleValue)){
                        count++;
                }

            }

        } else if(ruleKey.equals("name")){
            for(int i = 0; i<items.size();i++){
                    if(items.get(i).get(2).equals(ruleValue)){
                        count++;
                }

            }

        }else{
            System.out.println("please eenter rigth");
        }
        return count;
    }
} */
//shorter method
public class ques11 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please ");

         int rows = in.nextInt();
        in.nextLine(); 

List<List<String>> items = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
    List<String> row = new ArrayList<>();

    for (int j = 0; j < 3; j++) {
        row.add(in.next());
    }

    items.add(row);
}
in.nextLine();
System.out.println("please enter rulekey");
String ruleKey = in.nextLine();
System.out.println("please enter rule value");
String ruleValue = in.nextLine();
int result = countMatches(items,ruleKey , ruleValue);
System.out.println(result);

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column;

    if (ruleKey.equals("type")) {
        column = 0;
    } else if (ruleKey.equals("color")) {
        column = 1;
    } else {
        column = 2;
    }

    int count = 0;
    for (List<String> item : items) {
        if (item.get(column).equals(ruleValue)) {
            count++;
        }
    }

    return count;

    }
}
// upper one is what i prefer