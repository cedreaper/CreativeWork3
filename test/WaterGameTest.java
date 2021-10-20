package test;

import model.Elephant;
import model.WaterGame;

public class WaterGameTest {

    public static void main(String[] args) {

        //testing purposes of the models

        Elephant ele = new Elephant(50, 50, 100, 100, 2, "Elephant", false);
        ele.fillWater();

        assert ele.getHasWater();
        System.out.println(WaterGame.getWaterGame().getScore());
        assert WaterGame.getWaterGame().getScore() == 750;

        //assert game.getScore() == 3750;
    }
  


}
