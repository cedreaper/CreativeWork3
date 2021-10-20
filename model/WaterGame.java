package model;

public class WaterGame {

    private static WaterGame game;

    private final int MAX_CAPACITY = 12;
    private final int MAX_TIME = 100000;

    private int currentWaterLvl;
    private int timeRemaining;

    private int score;

    private String container = "Water Tank";

    private WaterGame() {

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
        score += score;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getMAX_TIME() {
        return MAX_TIME;
    }

    public static WaterGame getWaterGame() {

        //only want to have 1 object created ever only

        if(game == null) {

            game = new WaterGame();
        }

        return game;
    }

    
}
