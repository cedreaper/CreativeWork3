package model;

public class Human extends Player {
    
    private final int MAX_SPEED = 10;
    public final int WATER_CAPACITY = 2;

    private String gender;
    private String waterContainer = "bucket";
    private String status = "";


    public Human(int x, int y, int width, int height, int speed, String name, boolean hasWater, String gender) {

        super(x, y, width, height, speed, name, hasWater);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCapacity() {

        return WATER_CAPACITY;
    }

    public String getWaterContainer() {
        return waterContainer;
    }

    public int getMaxSpeed() {
        return MAX_SPEED;
    }

    @Override
    public void fillWater() {
        
        
        status = getName() + " fills " + waterContainer + " with water from the pond.";
        setCurrentWater(WATER_CAPACITY);
        setHasWater(true);
        
        
    }

    @Override
    public void depositWater() {
        
        status = getName() + " empties " + waterContainer + " into the tank and the water rises.";
        setCurrentWater(0);
        setHasWater(false);
        
    }

    public int getWATER_CAPACITY() {
        return WATER_CAPACITY;
    }

    
    
}
