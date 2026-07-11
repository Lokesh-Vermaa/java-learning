package com.example.geometry;

import java.util.Scanner;

import com.example.abstraction.shape;

public class circles extends shape{
    private float radius;

    Scanner input = new Scanner(System.in);

    public circles(float radius) {
        this.radius = radius;
    }

    

    @Override
    public String toString() {
        return "circles [radius=" + radius + "]";
    }



    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if(radius>0){
            this.radius = radius;
        }
    }
    public void calculatearea(){
        float radius = input.nextFloat();
        double CircleArea = (3.14)*(radius*radius);
        System.out.println("the area of the circle is "+CircleArea);

    }
    
}
