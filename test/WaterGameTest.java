package test;

import model.WaterGame;

public class WaterGameTest {

    public static void main(String[] args) {

        //testing purposes of the models

        WaterGame game = new WaterGame();

        assert game.getScore() == 3000;
    }
  


}
