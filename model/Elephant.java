package model;

public class Elephant extends Player {

    private final int MAX_SPEED = 5;
    public final int WATER_CAPACITY = 4;

    String waterContainer = "trunk";

    String status = "";

    public Elephant(int x, int y, int width, int height, int speed, String name, boolean hasWater) {

        super(x, y, width, height, speed, name, hasWater);

    }

    public int getMaxSpeed() {

        return MAX_SPEED;
    }

    public int getWaterCapacity() {

        return WATER_CAPACITY;
    
    }

    @Override
    public void fillWater() {
       
        status = "The " + getName() + " fills its " + waterContainer + " with water from the pond.";
        setCurrentWater(WATER_CAPACITY);
        setHasWater(true);
        
    }

    @Override
    public void depositWater() {
        
        status = getName() + " empties its " + waterContainer + " into the tank and the water rises higher.";
        setCurrentWater(0);
        setHasWater(false);
        
    }

    
    
}
