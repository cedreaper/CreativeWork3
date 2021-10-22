package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import model.Elephant;
import model.Human;
import model.images.ImageStore;
import view.GamePanel.GameState;

public class GameCanvas extends JPanel {

    public GamePanel panel;

    public GameCanvas(GamePanel panel) {

        this.panel = panel;
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.blue);
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        GameState state = panel.getState();

        if(state.equals(GameState.READY)) {

            g2.setColor(Color.white);
            g2.setFont(new Font("arial black", Font.BOLD, 48));
            g2.drawString("FiLL ThE TaNk", 50, 100);

            g2.setColor(Color.green);
            g2.fillRect(0, 350, 500, 50);

            g2.setColor(Color.black);
            g2.drawRect(-10, 350, 510, 50);

            BufferedImage waterTank = ImageStore.waterTank;
            BufferedImage man = ImageStore.man;
            BufferedImage woman = ImageStore.woman;
            BufferedImage elephant = ImageStore.elephant;

            g2.drawImage(waterTank, null, 200, 165);
            g2.drawImage(man, null, 100, 300);
            g2.drawImage(woman, null, 400, 300);
            g2.drawImage(elephant, null, 290, 305);

            g2.setColor(Color.green);
            g2.setFont(new Font("arial black", Font.BOLD, 20));
            g2.drawString("Select Player and Press Start to Play", 25, 150);

       
        }
        else if(state.equals(GameState.PLAYING)) {

            setBackground(Color.black);

            g2.setColor(Color.blue);
            g2.fillRect(0, 0, 50, 400);

            g2.setColor(Color.gray);
            g2.fillRect(50, 0, 10, 400);

            g2.setColor(Color.black);
            g2.drawRect(50, 0, 10, 400);

            for(int i = 0; i < 17; i++) {

                g2.fillRect(50, i * 25, 50, 5);

            }

            BufferedImage waterTank = ImageStore.waterTank;

            g2.drawImage(waterTank, null, 385, 100);


           panel.getPlayer().render(g2);

           g2.setColor(Color.white);
           g2.setFont(new Font("arial black", Font.BOLD, 20));
           g2.drawString("Water", 300, 25);
           g2.drawString("Score: " + panel.getGame().getScore(), 60, 75);
           g2.drawString("Time", 60, 25);

           
           //water bar
           g2.setColor(Color.blue);
           for(int i = 0; i < panel.getGame().getMAX_CAPACITY(); i++) {

            g2.fillRect(300, 30, 15 * i, 20);

           }
           
           //time bar
           if(panel.getGame().getTimeRemaining() < panel.getGame().getMAX_TIME()/ 2) {

            g2.setColor(Color.red);

           }
           else {

            g2.setColor(Color.green);

           }
           
           for(int i = 0; i < (panel.getGame().getTimeRemaining() / 1000); i++) {

            g2.fillRect(65, 30, 2 * i, 20);

           }



        }
        else if (state.equals(GameState.WIN)) {


            g2.setColor(Color.WHITE);
            g2.setFont(new Font("arial black", Font.BOLD, 48));
            g2.drawString("     YOU WIN!", 20, 100);
            g2.setFont(new Font("arial black", Font.BOLD, 18));
            g2.drawString("The people of WaterVille are saved!", 25, 250);

            g2.setColor(Color.green);
            g2.drawString("           Press Start to Play Again", 25, 300);



        }
        else if (state.equals(GameState.LOSE)) {

            setBackground(Color.black);
            g2.setColor(Color.red);
            g2.setFont(new Font("arial black", Font.BOLD, 48));
            g2.drawString("    YOU LOSE!", 20, 100);
            g2.setFont(new Font("arial black", Font.BOLD, 18));
            g2.drawString("The people of WaterVille are no more!", 25, 250);
            g2.setColor(Color.green);
            g2.drawString("           Press Start to Play Again", 25, 300);

        }

        repaint();

    }
    
}
