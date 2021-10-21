package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameCanvas extends JPanel {

    public GamePanel panel;

    public GameCanvas(GamePanel panel) {

        this.panel = panel;
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.black);
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

    }
    
}
