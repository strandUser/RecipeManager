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
    SaveButtonLogic buttonLogic = new SaveButtonLogic(mainFrame,testText,testLabel);
    JButton testButton = new JButton("Save Recipe");
    JPanel buttonBorder = new JPanel();

    //Prompt Fields
    JLabel recipeName = new JLabel("Recipe Name:");
    JLabel websiteName = new JLabel("Website:");
    JLabel instructions = new JLabel("Instructions");

    //Input Fields - add action listeners
    JTextField recipeNameField = new JTextField();
    JTextField websiteNameField = new JTextField();
    JTextField instructionsField = new JTextField();

    public AddRecipeControls(){
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        this.mainGrid.setLayout(new GridLayout(4,2));
        this.mainFrame.add(mainGrid);

        this.testText.addActionListener(testLogic);
        //System.out.println(testText.getText());

        this.buttonBorder.setLayout(new BorderLayout());
        this.buttonBorder.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.buttonBorder.add(testButton);
        this.testButton.addActionListener(buttonLogic);

        //this.testLabel.setText("Test");
        //this.testLabel.setText(this.testText.getText());
        this.mainFrame.updateUI();
        this.mainGrid.add(recipeName);
        this.mainGrid.add(recipeNameField);
        this.mainGrid.add(websiteName);
        this.mainGrid.add(websiteNameField);
        this.mainGrid.add(instructions);
        this.mainGrid.add(instructionsField);
        this.mainGrid.add(buttonBorder);


    }

    public JPanel getAddControls(){ return this.mainFrame; }
}