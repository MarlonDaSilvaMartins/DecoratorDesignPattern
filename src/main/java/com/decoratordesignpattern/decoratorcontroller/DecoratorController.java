package com.decoratordesignpattern.decoratorcontroller;

import com.decoratordesignpattern.decoratorservice.DecoratorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("v1/")
public class DecoratorController {
    private final DecoratorService decoratorService;

    @GetMapping("window")
    public String decorateWithWindow(){
        return decoratorService.decorateWithWindow();
    }

    @GetMapping("door")
    public String decorateWithDoor(){
        return decoratorService.decorateWithDoor();
    }

    @GetMapping
    public String decorate(){
        return decoratorService.decorate();
    }
}
