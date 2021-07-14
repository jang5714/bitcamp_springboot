package com.example.demo.Dog.service;

import com.example.demo.Dog.domain.DogDTO;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class DogServiceimpl implements DogService{
    private final DogDTO dog;
    private List<DogDTO> dogs;

    public DogServiceimpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<?> show() {
        return dogs;
    }

    @Override
    public String barking(String bark) {
        return dog.toString() + bark + " 짖는다";
    }

    @Override
    public String fetching(String target) {
        return dog.toString() + target + "을 물어온다";
    }

    @Override
    public String waggingTail() {
        return "꼬리를 흔든다";
    }
}
