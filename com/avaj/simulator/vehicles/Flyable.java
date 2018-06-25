package com.avaj.simulator.vehicles;

public interface Flyable{
    
    void updateConditions();
    
    void registerTower(WeatherTower weatherTower);
}