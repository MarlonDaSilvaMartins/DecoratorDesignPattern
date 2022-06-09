package com.decoratordesignpattern.model;

public class Door extends HouseDecorator{
    public Door(House house){
        super(house);
    }

    public String decorate(){
        return super.decorate() + decorateWithDoor();
    }

    public String decorateWithDoor(){
        return " with door";
    }
}
