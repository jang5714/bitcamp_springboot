package com.example.demo.Dog.service;
//barking, fetching, wagging tail
public interface DogService {

    //무조건 함수로 해야 한다;
    String barking (String bark);
    String fetching (String target);
    String waggingTail();
}
