package com.company.creationalPatterns.abstractFactory;

public interface AbstractFactory<T>{

    T create(String type);
}
