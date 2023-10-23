package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import RecipeManager.GUI.RightControls.*;

public class MainGUI extends JFrame {
    private int frameWidth = 750;
    private int frameHeight = 500;
    private JPanel mainPanel = new JPanel();
    private JTabbedPane tabbedPane = new JTabbedPane();

    //Components
    private RightControls rControls = new RightControls();
    private LeftControls lControls = new LeftControls();
    private ListViewer lview = new ListViewer();

    public MainGUI(){
        //this.mainPanel.setLayout(new GridLayout(1,1));
        //this.tabbedPane.setLayout(new GridLayout(2,2));

        //TODO: add things here
        //this.mainPanel.add(tabbedPane);
        this.tabbedPane.addTab("Recipe List",lview.getList());
        this.tabbedPane.addTab("Tab 2",lControls.getRightControls());


        add(this.tabbedPane);
        setSize(frameWidth,frameHeight);
    }

    public static void main(String[] args){
        JFrame frame = new MainGUI();
        frame.setTitle("Recipe Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}