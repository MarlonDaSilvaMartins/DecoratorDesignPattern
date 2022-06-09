package com.decoratordesignpattern.model;

public class HouseImpl implements House{
    @Override
    public String decorate(){
        return "House";
    }
}
