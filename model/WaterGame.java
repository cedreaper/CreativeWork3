package model;

public class WaterGame {


    private final int MAX_CAPACITY = 12;
    private final int MAX_TIME = 100000;

    private int currentWaterLvl;
    private int timeRemaining;

    private int score;


    public WaterGame() {

        timeRemaining = MAX_TIME;
        currentWaterLvl = 0;
        score = 0;
        
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

    public void setScore(int score) {
        this.score += score;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getMAX_TIME() {
        return MAX_TIME;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    
}
