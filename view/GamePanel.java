package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import model.Elephant;
import model.Human;
import model.Player;
import model.WaterGame;
import model.images.ImageStore;

public class GamePanel {


    public enum GameState {

        READY, PLAYING, LOSE, WIN;

    }

    private JFrame window;

    private GameCanvas canvas;

    private WaterGame game = new WaterGame();
    private Player player;

    private JButton fillButton = new JButton("Fill");
    private JButton exitButton = new JButton("Exit");
    private JButton depositButton = new JButton("Deposit");
    private JButton startButton = new JButton("Start");

    private JRadioButton radioMale = new JRadioButton("Male");
    private JRadioButton radioFemale = new JRadioButton("Female");
    private JRadioButton radioHuman = new JRadioButton("Human");
    private JRadioButton radioElephant = new JRadioButton("Elephant");

    private GameState state = GameState.READY;


    public GamePanel(JFrame window) {

        this.window = window;
    }

    public void init() {



        Container cp = window.getContentPane();

        ButtonGroup playerGroup = new ButtonGroup();
        playerGroup.add(radioHuman);
        playerGroup.add(radioElephant);
        
        ButtonGroup  genderGroup = new ButtonGroup();
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);

        radioMale.setSelected(true);
        radioHuman.setSelected(true);

        fillButton.setEnabled(false);
        depositButton.setEnabled(false);



        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 1));
        JPanel south1 = new JPanel();
        JPanel south2 = new JPanel();
        JPanel south1a = new JPanel();
        JPanel south1b = new JPanel();

        south1.setLayout(new GridLayout(1, 2));
        

        TitledBorder actionsBorder = new TitledBorder("Actions");
        TitledBorder playerBorder = new TitledBorder("Player Selections");
        TitledBorder genderBorder = new TitledBorder("Gender");

        south1a.setBorder(playerBorder);
        south1b.setBorder(genderBorder);

        south1a.add(radioHuman);
        south1a.add(radioElephant);

        south1b.add(radioMale);
        south1b.add(radioFemale);

        south1.add(south1a);
        south1.add(south1b);

        south2.setBorder(actionsBorder);
        

        south2.add(fillButton);
        south2.add(depositButton);
        south2.add(startButton);
        south2.add(exitButton);

        southPanel.add(south1);
        southPanel.add(south2);

        canvas = new GameCanvas(this);

        if(radioHuman.isSelected()) {
            // if we selected human, now we need a gender..

            if(radioFemale.isSelected()) {

                //create female
                //use dynamic binding
                player = new Human(300, 150, 70, 70, 5, "Sarah", false, "female");
                player.setImage(ImageStore.woman);
            }
            else {
                // create male with dynamic binding otherwise
                player = new Human(300, 150, 70, 70, 5, "Abel", false, "male");
                player.setImage(ImageStore.man);
            }
        }
        else {

            //if not human, then what else could we be.. an elephant..
            player = new Elephant(300, 150, 150, 70, 2, "Elephant", false);
            player.setImage(ImageStore.elephant);

        }


        cp.add(BorderLayout.CENTER, canvas);
        cp.add(BorderLayout.SOUTH, southPanel);
    }

    public GameState getState() {
        return state;
    }

    public GameCanvas getCanvas() {
        return canvas;
    }

    public JButton getDepositButton() {
        return depositButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getFillButton() {
        return fillButton;
    }

    public JRadioButton getRadioElephant() {
        return radioElephant;
    }

    public JRadioButton getRadioFemale() {
        return radioFemale;
    }

    public JRadioButton getRadioHuman() {
        return radioHuman;
    }

    public JRadioButton getRadioMale() {
        return radioMale;
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JFrame getWindow() {
        return window;
    }

    public WaterGame getGame() {
        return game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    
}
