package com.decoratordesignpattern.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class HouseDecorator implements House{
    private House house;

    @Override
    public String decorate(){
        return house.decorate();
    }
}
