package RecipeManager.GUI;

import RecipeManager.logic.TextFieldActionListener;
import RecipeManager.logic.SaveButtonLogic;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class AddRecipeControls {
    JPanel mainFrame = new JPanel();
    JPanel mainGrid = new JPanel();
    JLabel testLabel = new JLabel();
    JTextField testText = new JTextField();
    TextFieldActionListener testLogic = new TextFieldActionListener();
    SaveButtonLogic buttonLogic = new SaveButtonLogic(mainFrame);
    JButton testButton = new JButton("Save Recipe");
    JPanel buttonBorder = new JPanel();

    public AddRecipeControls(){
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        this.mainGrid.setLayout(new GridLayout(3,1));
        this.mainFrame.add(mainGrid);

        this.testText.addActionListener(testLogic);
        //System.out.println(testText.getText());

        this.buttonBorder.setLayout(new BorderLayout());
        this.buttonBorder.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.buttonBorder.add(testButton);
        this.testButton.addActionListener(buttonLogic);

        //this.testLabel.setText("Test");
        this.testLabel.setText(this.testText.getText());
        this.mainGrid.add(testLabel);
        this.mainGrid.add(testText);
        this.mainGrid.add(buttonBorder);


    }

    public JPanel getAddControls(){ return this.mainFrame; }
}