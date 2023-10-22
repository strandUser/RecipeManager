package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import RecipeManager.GUI.RightControls.*;

public class MainGUI extends JFrame {
    private int frameWidth = 750;
    private int frameHeight = 500;
    private JPanel mainPanel = new JPanel();

    //Components
    private RightControls rControls = new RightControls();

    public MainGUI(){
        this.mainPanel.setLayout(new GridLayout(1,2));

        //TODO: add things here
        this.mainPanel.add(rControls.getRightControls());

        add(this.mainPanel);
        setSize(frameWidth,frameHeight);
    }

    public static void main(String[] args){
        JFrame frame = new MainGUI();
        frame.setTitle("Recipe Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}