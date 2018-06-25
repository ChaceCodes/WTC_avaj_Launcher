package simulator.vehicles;

import simulator.Coordinates;

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