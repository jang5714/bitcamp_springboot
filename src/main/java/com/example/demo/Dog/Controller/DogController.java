package com.example.demo.Dog.Controller;

import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.Dog.service.DogService;
import com.example.demo.Dog.service.DogServiceimpl;

import java.util.List;


public class DogController {
    private final DogService dogService;

    public DogController (){
        dogService = new DogServiceimpl();
    }

    public void add(DogDTO dog){
        dogService.add(dog);
    }

    public int count() {
        return dogService.count();
    }

    public void show(){
        System.out.println("강아지의 수 : " + dogService.count());
        System.out.println(dogService.show());
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }

    public String fetching(String target) {
        return dogService.fetching(target);
    }

    public String waggingTail() {
        return dogService.waggingTail();
    }
}
