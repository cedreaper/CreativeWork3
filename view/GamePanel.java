package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GamePanel {

    private JFrame window;

    private GameCanvas canvas;

    private JButton fillButton = new JButton("Fill");
    private JButton exitButton = new JButton("Exit");
    private JButton depositButton = new JButton("Deposit");
    private JButton startButton = new JButton("Start");

    private JRadioButton radioMale = new JRadioButton("Male");
    private JRadioButton radioFemale = new JRadioButton("Female");
    private JRadioButton radioHuman = new JRadioButton("Human");
    private JRadioButton radioElephant = new JRadioButton("Elephant");


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


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 1));
        JPanel south1 = new JPanel();
        JPanel south2 = new JPanel();

        south2.add(fillButton);
        south2.add(depositButton);
        south2.add(startButton);
        south2.add(exitButton);

        southPanel.add(south1);
        southPanel.add(south2);

        canvas = new GameCanvas(this);


        cp.add(BorderLayout.CENTER, canvas);
        cp.add(BorderLayout.SOUTH, southPanel);
    }
}
