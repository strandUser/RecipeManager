package RecipeManager.logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonLogic implements ActionListener {
    JPanel test;
    JTextField userInput;

    JLabel userOut;

    public SaveButtonLogic(JPanel mainTab, JTextField userInput, JLabel userOut){
        this.test = mainTab;
        this.userInput = userInput;
        this.userOut = userOut;
    }
    public void actionPerformed(ActionEvent e){
        this.userOut.setText(userInput.getText());
        this.test.updateUI();
    }
}