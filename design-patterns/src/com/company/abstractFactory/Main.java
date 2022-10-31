package com.company.creationalPatterns.abstractFactory;

public class Main {

    public static void main(String[] args) {

        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Furniture furniture = furnitureFactory.create("Sofa");
        System.out.println(furniture.getClass().getSimpleName());

    }
}
