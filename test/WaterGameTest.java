package test;

import model.Elephant;
import model.Human;


public class WaterGameTest {

    public static void main(String[] args) {

        //testing purposes of the models

        Elephant ele = new Elephant(50, 50, 100, 100, 2, "Elephant", false);
        Human hum = new Human(75, 75, 70, 70, 2, "Human", false, "male");


        ele.fillWater();

        assert ele.getCurrentWater() == ele.getWaterCapacity();
        assert ele.getHasWater();

        
        ele.depositWater();

        assert !ele.getHasWater();

        assert ele.getCurrentWater() == 0;

        hum.fillWater();

        assert hum.getHasWater();

        assert hum.getCurrentWater() == hum.getCapacity();

        hum.depositWater();

        assert !hum.getHasWater();

        assert hum.getCurrentWater() == 0;

    }
  


}
