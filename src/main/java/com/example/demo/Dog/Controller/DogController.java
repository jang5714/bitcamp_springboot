package com.example.demo.Dog.Controller;

import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.Dog.service.DogService;
import com.example.demo.Dog.service.DogServiceimpl;

import java.util.Scanner;

public class DogController {

    private DogService dogService;
    private DogDTO dog;
    private Scanner scanner;

    public DogController(){
        this.dogService = new DogServiceimpl();
        this.dog = new DogDTO();
        this.scanner = new Scanner(System.in);
    }

    public void DogController (){
        System.out.println("이름이 무엇이냐");
        dog.setName(scanner.next()); //set은 입력만
        System.out.println("색깔이 무엇이냐");
        dog.setColor(scanner.next());
        System.out.println("품종이 무엇이니");
        dog.setBreed(scanner.next());
        System.out.println("배고 프니?");
        dog.setHungry(scanner.next());

        System.out.printf(dog.toString());
    }
}
