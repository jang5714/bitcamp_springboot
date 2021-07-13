package com.example.demo.Dog.service;

import com.example.demo.Dog.domain.DogDTO;

import java.util.List;

//barking, fetching, wagging tail
public interface DogService {
    void add(DogDTO dog); // Dog 배열안에 dog 추가
    int count(); // dog 배열의 크기
    List<DogDTO> show (); //dog 배열
    String barking (String bark);
    String fetching (String target);
    String waggingTail();
}
