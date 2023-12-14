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
    TextFieldActionListener fieldListenerUser = new TextFieldActionListener();

    Map<String,Map<String,String>> listOfRecipes;

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

    SaveButtonLogic buttonLogic = new SaveButtonLogic(mainFrame,recipeNameField, websiteNameField, in   structionsField, testLabel,);

    public AddRecipeControls(Map<String,Map<String,String>> listToAdd){
        this.listOfRecipes = listToAdd;
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        this.mainGrid.setLayout(new GridLayout(4,2));
        this.mainFrame.add(mainGrid);

        //add action listeners

        this.recipeNameField.addActionListener(fieldListenerUser);
        this.websiteNameField.addActionListener(fieldListenerUser);
        this.instructionsField.addActionListener(fieldListenerUser);

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
        this.mainGrid.add(testLabel);


    }

    public JPanel getAddControls(){ return this.mainFrame; }
}