package com.example.utils;

import java.util.Scanner;

import com.example.geometry.circles;
import com.example.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circles areas = new circles(0);
        rectangle areass = new rectangle(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("which shape are we talking about here:");
        String shape = input.nextLine();
        if(shape.equals("circle")){
            areas.calculatearea();
        }else if(shape.equals("rectangle")){
            areass.calculatearea();

        }else{
            System.out.println("please enter a valid shape");
        }
    }
}
