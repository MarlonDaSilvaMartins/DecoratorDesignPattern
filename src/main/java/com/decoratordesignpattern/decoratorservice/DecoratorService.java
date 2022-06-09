package com.decoratordesignpattern.decoratorservice;

import com.decoratordesignpattern.model.Door;
import com.decoratordesignpattern.model.House;
import com.decoratordesignpattern.model.HouseImpl;
import com.decoratordesignpattern.model.Window;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DecoratorService {
    public String decorateWithWindow(){
        House house = new Window(new HouseImpl());
        return house.decorate();
    }

    public String decorateWithDoor(){
        House house = new Door(new HouseImpl());
        return house.decorate();
    }

    public String decorate(){
        House house = new Door(new Window(new HouseImpl()));
        return house.decorate();
    }
}
