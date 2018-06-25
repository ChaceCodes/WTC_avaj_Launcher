package com.avaj.simulator.vehicles;

import com.avaj.simulator.Coordinates;

public class Helicopter extends Aircraft{
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates){
        Super(name, coordinates);
    }

    public void updateConditions(){

    }

    public void registerTower(WeatherTower weatherTower){
    }
}