package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServicelmpl implements BicycleService {

    private final List<BicycleDTO> bicycles;

    public BicycleServicelmpl(){
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
    public List<? extends BicycleDTO> show() {
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
