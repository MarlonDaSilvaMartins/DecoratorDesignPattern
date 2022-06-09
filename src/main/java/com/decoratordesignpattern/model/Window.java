package com.decoratordesignpattern.model;

public class Window extends HouseDecorator{
    public Window(House house){
        super(house);
    }

    public String decorate(){
        return super.decorate() + decorateWithWindow();
    }

    private String decorateWithWindow(){
        return " with window";
    }
}
