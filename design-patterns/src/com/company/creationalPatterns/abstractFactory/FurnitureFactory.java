package com.company.creationalPatterns.abstractFactory;

public class FurnitureFactory implements AbstractFactory<Furniture>{
    @Override
    public Furniture create(String type) {
        return switch (type) {
            case "Sofa" -> new Sofa();
            case "Chair" -> new Chair();
            case "Table" -> new Table();
            default -> null;
        };
    }
}
