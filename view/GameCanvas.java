package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameCanvas extends JPanel {

    public GamePanel panel;

    public GameCanvas(GamePanel panel) {

        this.panel = panel;
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        
    }
    
}
