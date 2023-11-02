package RecipeManager.GUI;

import RecipeManager.logic.TextFieldActionListener;

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

    public AddRecipeControls(){
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        this.mainGrid.setLayout(new GridLayout(2,1));
        this.mainFrame.add(mainGrid);

        this.testText.addActionListener(testLogic);
        //System.out.println(testText.getText());

        this.testLabel.setText("Test");
        this.mainGrid.add(testLabel);
        this.mainGrid.add(testText);

    }

    public JPanel getAddControls(){ return this.mainFrame; }
}