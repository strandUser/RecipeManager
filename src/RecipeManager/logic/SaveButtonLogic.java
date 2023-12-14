package RecipeManager.logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import RecipeManager.logic.recipeSaveStructure;

//Referenced https://www.geeksforgeeks.org/message-dialogs-java-gui/
//https://stackoverflow.com/questions/9119481/how-to-present-a-simple-alert-message-in-java
//https://www.w3schools.com/java/java_operators.asp
//https://stackoverflow.com/questions/13731710/allowing-the-enter-key-to-press-the-submit-button-as-opposed-to-only-using-mo
//https://stackoverflow.com/questions/38720879/how-to-set-label-text-to-jtextfield-input

public class SaveButtonLogic implements ActionListener {
    JPanel test;
    JTextField nameInput;
    JTextField websiteInput;
    JTextField instructionsInput;

    Map<String,Map<String,String>> userInOut;

    JLabel userOut;

    public SaveButtonLogic(JPanel mainTab, JTextField nameField, JTextField websiteField, JTextField instructionsField, JLabel userOut, Map<String,Map<String,String>> userInOut){
        this.test = mainTab;
        this.userInOut = userInOut;

        this.nameInput = nameField;
        this.websiteInput = websiteField;
        this.instructionsInput = instructionsField;

        this.userOut = userOut;



    }
    public void actionPerformed(ActionEvent e){

        if (this.nameInput.getText().isEmpty() || this.websiteInput.getText().isEmpty() || this.instructionsInput.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Fill in all fields","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{ //This is a good form filled out
            recipeSaveStructure newCreationTest = new recipeSaveStructure(nameInput.getText(),websiteInput.getText(),instructionsInput.getText());
            System.out.println(newCreationTest.toJson().get("recipeName"));

            TreeMap<String,String> tempData = new TreeMap<>();
            tempData.put("recipeName",nameInput.getText());
            tempData.put("websiteName",websiteInput.getText());
            tempData.put("instructions",instructionsInput.getText());
            userInOut.put(nameInput.getText(),tempData);

            this.userOut.setText(nameInput.getText());
            this.test.updateUI();
        }
    }
}