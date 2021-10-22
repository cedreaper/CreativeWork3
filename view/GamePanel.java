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

import controller.MainListener;
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

    private WaterGame game;
    private Player player;

    private Elephant e1 = new Elephant(300, 150, 150, 70, 5, "Elephant", false);
    private Human h1 = new Human(300, 150, 70, 70, 10, "Abel", false, "male");
    private Human h2 = new Human(300, 150, 70, 70, 10, "Sarah", false, "female");

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

    

        MainListener listener = new MainListener(this);

        exitButton.addActionListener(listener);
        exitButton.setFocusable(false);
        depositButton.addActionListener(listener);
        depositButton.setFocusable(false);
        fillButton.addActionListener(listener);
        fillButton.setFocusable(false);
        startButton.addActionListener(listener);
        startButton.setFocusable(false);
        
        canvas.addKeyListener(listener);
        canvas.requestFocusInWindow();
        canvas.setFocusable(true);


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

    public void setState(GameState state) {
        this.state = state;
    }

    public void disableRadioButtons() {

        radioElephant.setEnabled(false);
        radioFemale.setEnabled(false);
        radioMale.setEnabled(false);
        radioHuman.setEnabled(false);
    }

    public void enableRadioButtons() {

        radioElephant.setEnabled(true);
        radioFemale.setEnabled(true);
        radioMale.setEnabled(true);
        radioHuman.setEnabled(true);
    }

    public Elephant getE1() {
        return e1;
    }

    public Human getH1() {
        return h1;
    }

    public Human getH2() {
        return h2;
    }

    public void setGame(WaterGame game) {
        this.game = game;
    }


    
}
