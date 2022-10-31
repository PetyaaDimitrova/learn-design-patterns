package com.company.creationalPatterns.prototypePattern;

public class Triangle extends Shape{

    public Triangle(){
        type = "Triangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
