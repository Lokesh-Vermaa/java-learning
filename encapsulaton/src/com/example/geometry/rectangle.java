package com.example.geometry;

import java.util.Scanner;

import com.example.abstraction.shape;

public class rectangle extends shape {
    private float length;
    private float width;


    Scanner input = new Scanner(System.in);

    
    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    
    @Override
    public String toString() {
        return "rectangle [length=" + length + ", width=" + width + "]";
    }


    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if(length>0){
            this.length = length;
        }
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if(width>0){
            this.width = width;
        }
    }
    public void calculatearea(){
        float length = input.nextFloat();
            float width = input.nextFloat();
        double RectangleArea = length*width;
        System.out.println("the area of the rectangle is "+RectangleArea);
    }



    
}
