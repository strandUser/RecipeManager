package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;
import RecipeManager.GUI.RightControls.*;

public class MainGUI extends JFrame {
    private int frameWidth = 750;
    private int frameHeight = 500;
    private JPanel mainPanel = new JPanel();
    private JTabbedPane tabbedPane = new JTabbedPane();

    //Recipe Lists
    private Map<String, Map<String,String>> recipeList = new TreeMap();

    //Components for tabs
    private RightControls rControls = new RightControls(); //Temp
    private LeftControls lControls = new LeftControls(); //Temp
    private ListViewer lview = new ListViewer(recipeList);
    private AddRecipeControls addRec = new AddRecipeControls();





    public MainGUI(){
        this.mainPanel.setLayout(new BorderLayout());
        //this.tabbedPane.setLayout(new GridLayout(2,2));

        //TODO: add things here
        //this.mainPanel.add(tabbedPane);
        this.tabbedPane.addTab("Recipe List",lview.getList());
        this.tabbedPane.addTab("Add Recipes",addRec.getAddControls());

        //add tabs
        this.mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        this.mainPanel.add(tabbedPane,BorderLayout.CENTER);

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