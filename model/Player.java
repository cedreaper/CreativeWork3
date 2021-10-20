package model;

public abstract class Player implements IWaterHandler {

    private int x;
    private int y;
    private int width;
    private int height;
    private int currentWater = 0;
    private int speed;
    private String name;
    private boolean hasWater;
    

    public Player(int x, int y, int width, int height, int speed, String name, boolean hasWater) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.name = name;
        this.hasWater = hasWater;


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCurrentWater() {

        return currentWater;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean getHasWater() {

        return hasWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }





    
}
