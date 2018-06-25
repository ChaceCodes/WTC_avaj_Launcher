package simulator.vehicles;

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