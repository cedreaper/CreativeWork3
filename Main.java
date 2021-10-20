import javax.swing.JFrame;

import view.GamePanel;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("Fill the Tank");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var game = new GamePanel(window);
        game.init();
        window.pack();
        window.setVisible(true);
        

    }
}