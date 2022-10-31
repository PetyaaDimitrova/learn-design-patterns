package com.company.creationalPatterns.abstractFactory;

public class Chair implements Furniture{
    @Override
    public String type() {
        return "Chair";
    }
}
