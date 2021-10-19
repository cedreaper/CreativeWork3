package model;

public class WaterGame {

    private final int MAX_CAPACITY = 12;
    private final int MAX_TIME = 100000;

    private int currentWaterLvl;
    private int timeRemaining;

    private static int score;

    private String container = "Water Tank";

    public WaterGame() {

        score = 0;
        timeRemaining = MAX_TIME;
        currentWaterLvl = 0;

    } 

    public boolean checkWin() {

        boolean win = false;

        if(currentWaterLvl == MAX_CAPACITY) {

            win = true;
        }

        return win;
    }

    public boolean checkLose() {

        boolean lose = false;

        if(timeRemaining <= 0) {

            lose = true;
        }

        return lose;
    }

    public int getCurrentWaterLvl() {
        return currentWaterLvl;
    }

    public int getScore() {
        return score;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setCurrentWaterLvl(int currentWaterLvl) {
        this.currentWaterLvl = currentWaterLvl;
    }

    public static void setScore(int score) {
        score += score;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getMAX_TIME() {
        return MAX_TIME;
    }

    
}
