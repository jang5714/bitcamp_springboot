package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServicelmpl implements BicycleService {
    private final BicycleDTO bicycle;
    private ArrayList<BicycleDTO> bicycles;

    public BicycleServicelmpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }
    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }
    @Override
    public int count() {
        return bicycles.size();
    }
    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }
    @Override
    public void changingGear() {

    }
    @Override
    public void changingPedalcadence() {
    }
    @Override
    public void applyingBrakes() {

    }
}
