package simulator.vehicles;

import simulator.Coordinates;

public class Baloon extends Aircraft{
    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates){
        Super(name, coordinates);
    }

    public void updateConditions(){

    }

    public void registerTower(WeatherTower weatherTower){
    }
}