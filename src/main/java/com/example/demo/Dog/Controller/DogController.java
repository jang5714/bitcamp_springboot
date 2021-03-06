package com.example.demo.Dog.Controller;

import com.example.demo.Dog.domain.DogDTO;
import com.example.demo.Dog.service.DogService;
import com.example.demo.Dog.service.DogServiceimpl;
import com.example.demo.utill.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;


public class DogController extends LambdaUtils {

    private DogService dogService;

    public DogController (){
        dogService = new DogServiceimpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while (true){
            print.accept("\n[메뉴]: 0-종료 1-추가 2-카운트 3-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    dog = new DogDTO();
                    print.accept("품종");
                    dog.setBreed(scanner.next());
                    print.accept("이름");
                    dog.setName(scanner.next());
                    print.accept("색깔");
                    dog.setColor(scanner.next());
                    dogService.add(dog);
                case "2":
                    print.accept(string.apply(dogService.count()));
                    break;
                case "3":
                    List<? extends DogDTO> list = dogService.findAll();
                    for (DogDTO d : list){
                        print.accept(d.toString());
                    }
                    break;
            }
        }
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
