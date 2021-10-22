package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import model.Elephant;
import model.WaterGame;
import view.GamePanel;
import view.GamePanel.GameState;

public class MainListener implements KeyListener, ActionListener {

    GamePanel panel;

    public MainListener(GamePanel panel) {

        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        if(button.equals(panel.getExitButton())) {

            panel.getWindow().dispose();
        }
        else if(button.equals(panel.getStartButton())) {

            //game is starting?
            panel.setState(GameState.PLAYING);

            panel.getStartButton().setEnabled(false);
            panel.disableRadioButtons();

            panel.setGame(new WaterGame());
            
        }
        else if(button.equals(panel.getFillButton())) {

            panel.getPlayer().fillWater();
            
            if(panel.getPlayer() instanceof Elephant) {

                panel.getGame().setScore(725);
            }
            else {

                panel.getGame().setScore(250);
            }

            panel.getFillButton().setEnabled(false);

        }
        else if(button.equals(panel.getDepositButton())) {

            
            panel.getGame().setCurrentWaterLvl(panel.getGame().getCurrentWaterLvl() + 
                panel.getPlayer().getCurrentWater());
            panel.getPlayer().depositWater();

            if(panel.getGame().checkWin()) {

                panel.setState(GameState.WIN);
            }
            
            

            if(panel.getPlayer() instanceof Elephant) {

                panel.getGame().setScore(3000);
            }
            else {

                panel.getGame().setScore(1500);
            }

            panel.getDepositButton().setEnabled(false);

            panel.getCanvas().repaint();
            

        }

        panel.getCanvas().repaint();
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(panel.getPlayer().getX() == 50 && !panel.getPlayer().getHasWater()) {
            
            panel.getFillButton().setEnabled(true);
            panel.getCanvas().repaint();
        }

        if(panel.getPlayer().getX() == 370 && panel.getPlayer().getHasWater()) {

            panel.getDepositButton().setEnabled(true);
            panel.getCanvas().repaint();
        }

        panel.getGame().setTimeRemaining(panel.getGame().getTimeRemaining() - 150);
        
        if(panel.getGame().checkLose()) {

            panel.setState(GameState.LOSE);
        }

        var key = e.getKeyCode();

        switch(key) {


            case KeyEvent.VK_LEFT:
                if(panel.getPlayer().getX() > 50) {

                    panel.getPlayer().translate(-panel.getPlayer().getSpeed(), 0);
                }
               
                break;
            case KeyEvent.VK_UP:
                if(panel.getPlayer().getY() > 50) {

                    panel.getPlayer().translate(0, -panel.getPlayer().getSpeed());
                }
                
                break;
            case KeyEvent.VK_DOWN:
                
                if(panel.getPlayer().getY() < 350) {

                    panel.getPlayer().translate(0, panel.getPlayer().getSpeed());
                }
                
                break;
            case KeyEvent.VK_RIGHT:

            if(panel.getPlayer().getX() < 386) {

                panel.getPlayer().translate(panel.getPlayer().getSpeed(), 0);
            }
                
                break;
        }

        panel.getCanvas().repaint();

        
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }

   
    
}
