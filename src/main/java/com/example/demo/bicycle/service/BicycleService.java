package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import javafx.scene.shape.SVGPath;

import java.util.List;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show ();
    void changingGear();
    void changingPedalcadence();
    void applyingBrakes();

}
